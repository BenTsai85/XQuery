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
        System.out.println("try read xml file");

        try {
            File xml = new File(file_name.substring(1, file_name.length() - 1));
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            // Ignore non-relevant whitespace (only works if the XML has an associated DTD)
            docFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(xml);
            doc.getDocumentElement().normalize();
            nodes.add(doc);
            System.out.println("read xml file");

        } catch (Exception e) {
            System.out.println("can't read xml file\n");
            return new LinkedList<>();
        }
        return nodes;

    }

    // return all children and given nodes
    public static LinkedList<Node> descOrSelf(LinkedList<Node> roots) {
        System.out.println("find all descendants");
        LinkedList<Node> nodes = (LinkedList) roots.clone(), res = (LinkedList) roots.clone();

        while (!res.isEmpty()) {
            Node n = res.pollFirst();
            LinkedList<Node> children = Helper.children(n);
            res.addAll(children);
            nodes.addAll(children);
        }
        return nodes;
    }

    // the text node associated to element node n
    public static LinkedList<Node> txt(Node n) {
        System.out.println("func: txt\n");
        return Helper.children(n);
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

    // the tag labeling element node n
    public static String tag(Node n) {
        return n.getNodeName();
    }
    /*
    [ap]A
    [rp]R(n)
    [f ]F (n)
    root(fn)       v
    children(n)    v
    parent(n)
    tag(n)         v
    txt(n)         v
    */
}
