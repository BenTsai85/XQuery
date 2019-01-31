import org.w3c.dom.Node;
import java.util.LinkedList;

// define the meaning of an XPath expression.
public class MyXQueryVisitor extends XQueryBaseVisitor<LinkedList<Node>> {
    private LinkedList<Node> nodes;

    public MyXQueryVisitor() {
        this.nodes = new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitApSingleSlash(XQueryParser.ApSingleSlashContext ctx) {
        System.out.println("single slash\n");
        visit(ctx.doc());
        // do rp recursively
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitDocName(XQueryParser.DocNameContext ctx) {
        System.out.println("doc name\n");
        this.nodes = Helper.root(ctx.FILENAME().getText());
        // do rp recursively
        return this.nodes;
    }
}
