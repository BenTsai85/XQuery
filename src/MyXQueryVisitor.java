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
        System.out.println("/");
        visit(ctx.doc());
        this.nodes = visit(ctx.rp());
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitApDoubleSlash(XQueryParser.ApDoubleSlashContext ctx) {
        System.out.println("//");
        visit(ctx.doc());
        this.nodes = Helper.descOrSelf(this.nodes);
        //this.nodes = Helper.descOrSelf(visit(ctx.doc()));
        this.nodes = visit(ctx.rp());
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitDocName(XQueryParser.DocNameContext ctx) {
        System.out.println("read" + ctx.FILENAME().getText());
        this.nodes = Helper.root(ctx.FILENAME().getText());
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpWildcard(XQueryParser.RpWildcardContext ctx) {
        System.out.println("*");
        LinkedList<Node> nodes = new LinkedList<>();
        for (Node n : this.nodes) {
            nodes.addAll(Helper.children(n));
        }
        this.nodes = nodes;
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpSingleSlash(XQueryParser.RpSingleSlashContext ctx) {
        System.out.println("/");
        // since RpSingleSlash must have two children, first visited left one, then right one
        visit(ctx.rp(0));
        this.nodes = visit(ctx.rp(1));
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpText(XQueryParser.RpTextContext ctx) {
        System.out.println("text()");
        LinkedList<Node> nodes = new LinkedList<>();

        for (Node n : this.nodes) {
            //System.out.println(n.toString());
            nodes.addAll(Helper.txt(n));
        }
        this.nodes = nodes;
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpTag(XQueryParser.RpTagContext ctx) {
        System.out.println("tagName");
        LinkedList<Node> nodes = new LinkedList<>();
        for (Node n : this.nodes) {
            LinkedList<Node> leaf = Helper.children(n);
            for (Node ln : leaf) {
                if (Helper.tag(ln).equals(ctx.Identifier().getText())) {
                    nodes.add(ln);
                }
            }
        }
        this.nodes = nodes;
        return this.nodes;
    }
}
