import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Frame{
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;

    private boolean errorFlag = false;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main frame = new Main();
            frame.setVisible(true);
        });
    }

    public Main() {
        // Crear el marco principal
        JFrame frame = new JFrame("Spell Translator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Crear los paneles
        JPanel panel1 = new JPanel();
        inputTextArea = new JTextArea();
        inputTextArea.setEditable(true);
        JScrollPane scrollPane1 = new JScrollPane(inputTextArea);
        panel1.setLayout(new BorderLayout());
        panel1.add(scrollPane1, BorderLayout.CENTER);

        JPanel panel2 = new JPanel();
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(true);
        JScrollPane scrollPane2 = new JScrollPane(outputTextArea);
        panel2.setLayout(new BorderLayout());
        panel2.add(scrollPane2, BorderLayout.CENTER);

        // Crear el JSplitPane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        splitPane.setResizeWeight(0.7);

        // Crear el botón
        JButton button = new JButton("Translate");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
                translateGCode();
                if(errorFlag){
                    outputTextArea.setText("");
                    errorFlag = false;
                }else{
                    loadFileContent("./output/output.txt");
                }
                button.setEnabled(true);
            }
        });

        // Agregar el JSplitPane y el botón al marco principal
        frame.add(splitPane, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        // Centrar el marco en la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Obtiene el tamaño de la pantalla
        int centerX = (screenSize.width / 2) - 300;
        int centerY = (screenSize.height / 2) - 250;
        frame.setLocation(centerX - frame.getSize().width / 2, centerY - frame.getSize().height / 2);

        // Ajustar el tamaño del marco, hacerlo visible
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    private void loadFileContent(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            outputTextArea.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void translateGCode() {
        String code = inputTextArea.getText();

        // create a CharStream from the input code
        CharStream charStream = CharStreams.fromString(code);

        // create a lexer that feeds off the input CharStream
        gcodeLexer lexer = new gcodeLexer(charStream);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        gcodeParser parser = new gcodeParser(tokens);

        // specify the error listener for the parser
        parser.removeErrorListeners(); // remove the default error listener
        parser.addErrorListener(new ConsoleErrorListener()); // add error listener to print errors to console

        // Instancia tu manejador de errores personalizado.
        customErrorListener errorListener = new customErrorListener();

        // Asigna el manejador de errores personalizado al analizador sintáctico.
        parser.removeErrorListeners(); // Elimina los manejadores de errores predeterminados.
        parser.addErrorListener(errorListener); // Agrega tu manejador de errores personalizado.

        // start parsing at the "s" rule
        ParseTree tree = parser.s();

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new mygcode(), tree);

        if(!errorListener.returnSyntaxError().equals("")){
            JOptionPane.showMessageDialog(null, errorListener.returnSyntaxError(), "Error", JOptionPane.ERROR_MESSAGE);
            errorFlag = true;
        }

        System.out.println(); // print a newline after translation
    }
}












