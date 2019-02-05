import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import java.util.LinkedList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        /* define input by console
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        */

        /* For Test (inputString example)
        doc("j_caesar.xml")/PLAY/TITLE/text()
        doc("j_caesar.xml")//text()
        doc("j_caesar.xml")/PLAY/../PLAY/TITLE/text()
        doc("test.xml")//*
        doc("test.xml")/root/all/../all/actors
        doc("test.xml")/root/all/actors/actor[@id = "a"] <- exist ? fail ?
        doc("test.xml")/root/actors/actor[@id and @index]
        doc(\"test.xml\")/root/actors/actor[@id], root/singers
         */
        String inputString = "doc(\"test.xml\")/root/actors/actor[@id=@index]";

        XQueryLexer lexer = new XQueryLexer(CharStreams.fromString(inputString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);
        ParseTree tree = parser.ap(); // ap is the starting rule
        //System.out.println(tree.toStringTree(parser));

        MyXQueryVisitor myVisitor = new MyXQueryVisitor();
        LinkedList<Node> nodes = myVisitor.visit(tree);

        /*
        System.out.println("Result:\n");
        if (nodes != null) {
            System.out.println(nodes.size());
            for (Node n : nodes) {
                System.out.println(n.toString());
            }
        }
        else {
            System.out.println("error");
        }
        */

        // save file
        writeToFile(nodes, "ans.xml");
    }

    public static void writeToFile(LinkedList<Node> nodes, String filePath) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc;
        try {
            doc = dbf.newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException ex) {
            return ;
        }
        Element ele = doc.createElement("ele");
        for(Node element : nodes){
            Node importedNode = doc.importNode(element, true);
            ele.appendChild(importedNode);
        }
        doc.appendChild(ele);

        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));

            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("File saved!");
    }
}
