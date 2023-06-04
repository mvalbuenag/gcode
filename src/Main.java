import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextArea inputTextArea;
    private JButton translateButton;

    public Main() {
        setTitle("GCode Translator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the input text area
        inputTextArea = new JTextArea();
        add(new JScrollPane(inputTextArea), BorderLayout.CENTER);

        // Create the translate button
        translateButton = new JButton("Translate");
        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                translateButton.setEnabled(false);
                translateGCode();
                translateButton.setEnabled(true);
            }
        });
        add(translateButton, BorderLayout.SOUTH);
        // Set the size of the window
        setSize(600, 400); // Adjust the width and height as desired

        setLocationRelativeTo(null);
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

        // start parsing at the "s" rule
        ParseTree tree = parser.s();

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new mygcode(), tree);

        System.out.println(); // print a newline after translation
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}





