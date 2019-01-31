import org.w3c.dom.*;
import java.util.LinkedList;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Helper {

    // root(fn)
    public static LinkedList<Node> root(String file_name) {
        LinkedList<Node> nodes = new LinkedList<>();
        System.out.println("try read xml file\n");

        try {
            File xml = new File(file_name.substring(1, file_name.length() - 1));
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            // Ignore non-relevant whitespace (only works if the XML has an associated DTD)
            docFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(xml);
            doc.getDocumentElement().normalize();
            nodes.add(doc);
            System.out.println("read xml file\n");

        } catch (Exception e) {
            System.out.println("can't read xml file\n");
            return new LinkedList<>();
        }
        return nodes;

    }
    /*
    [ap]A
    [rp]R(n)
    [f ]F (n)
    root(fn)
    children(n)   the list of children of element node n, ordered according to the document order
    parent(n)
    tag(n)
    txt(n)
    */
}
