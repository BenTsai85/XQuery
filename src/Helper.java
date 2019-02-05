import org.w3c.dom.*;
import java.util.LinkedList;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Helper {

    // root(fn)
    // read xml file  (https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm)
    public static LinkedList<Node> root(String file_name) {
        LinkedList<Node> nodes = new LinkedList<>();

        try {
            File xml = new File(file_name.substring(1, file_name.length() - 1));
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            docFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(xml);
            doc.getDocumentElement().normalize();
            nodes.add(doc);

        } catch (Exception e) {
            System.out.println("can't read xml file\n");
            return new LinkedList<>();
        }
        return nodes;

    }

    // the list of children of element node n, ordered according to the document order
    public static LinkedList<Node> children(Node n) {
        // NodeList -> LinkedList<Node>
        LinkedList<Node> nodes = new LinkedList<>();
        for (int i = 0; i < n.getChildNodes().getLength(); ++i) {
            //System.out.println(n.getChildNodes().item(i).toString());
            nodes.add(n.getChildNodes().item(i));
        }
        return nodes;
    }

    public static Node parent(Node n) {

        // attribute node ???
        return n.getParentNode();
    }

    // the tag labeling element node n
    public static String tag(Node n) {
        return n.getNodeName();
    }

    // the text node associated to element node n
    public static LinkedList<Node> txt(Node n) {
        System.out.println("func: txt\n");
        // text node ???
        return Helper.children(n);
    }

    public static LinkedList<Node> unique(LinkedList<Node> ori) {

        LinkedList<Node> nodes = new LinkedList<>();
        for (Node n : ori) {
            if (!nodes.contains(n)) {
                nodes.add(n);
            }
        }
        return nodes;
    }
    /*
    [ap]A
    [rp]R(n)
    [f ]F (n)
    root(fn)       v
    children(n)    v
    parent(n)      v
    tag(n)         v
    txt(n)         v
    */
}
