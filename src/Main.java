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

        /*
        "doc(\"j_caesar.xml\")/PLAY/FM/*"

         */
        String inputString = "doc(\"j_caesar.xml\")/PLAY/FM/*";
        System.out.print(inputString + "\n");

        XQueryLexer lexer = new XQueryLexer(CharStreams.fromString(inputString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);
        ParseTree tree = parser.ap(); // ap is the starting rule
        System.out.println(tree.toStringTree(parser));

        MyXQueryVisitor myVisitor = new MyXQueryVisitor();
        LinkedList<Node> nodes = myVisitor.visit(tree);
        for (Node n : nodes) {
            System.out.println(n.toString());
        }

    }
}
