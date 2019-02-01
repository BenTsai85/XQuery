import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.Scanner;
import org.w3c.dom.Node;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /* define input by console
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        */

        /* For Test
        doc("j_caesar.xml")/PLAY/TITLE/text()
         */
        String inputString = "doc(\"j_caesar.xml\")/PLAY/TITLE/text()";
        System.out.print(inputString + "\n");

        XQueryLexer lexer = new XQueryLexer(CharStreams.fromString(inputString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);
        ParseTree tree = parser.ap(); // ap is the starting rule
        System.out.println(tree.toStringTree(parser));

        MyXQueryVisitor myVisitor = new MyXQueryVisitor();
        LinkedList<Node> nodes = myVisitor.visit(tree);

        System.out.println("Result:\n");
        if (nodes != null) {
            for (Node n : nodes) {
                System.out.println(n.toString());
            }
        }
        else {
            System.out.println("error");
        }

    }
}
