import org.w3c.dom.*;
import java.util.LinkedList;

// define the meaning of an XPath expression.
public class MyXQueryVisitor extends XQueryBaseVisitor<LinkedList<Node>> {


    private LinkedList<Node> nodes;

    public MyXQueryVisitor() {
        this.nodes = new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitApSingleSlash(XQueryParser.ApSingleSlashContext ctx) {
        System.out.println("/"); // rule 1
        visit(ctx.doc());
        this.nodes = visit(ctx.rp());
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitApDoubleSlash(XQueryParser.ApDoubleSlashContext ctx) {
        System.out.println("//"); // rule 2
        visit(ctx.doc());

        // find all descOrSelf
        LinkedList<Node> res = (LinkedList) this.nodes.clone();
        while (!res.isEmpty()) {
            Node n = res.pollFirst();
            LinkedList<Node> children = Helper.children(n);
            res.addAll(children);
            this.nodes.addAll(children);
        }

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
    public LinkedList<Node> visitRpTag(XQueryParser.RpTagContext ctx) {
        System.out.println("tagName"); // rule 3
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

    @Override
    public LinkedList<Node> visitRpWildcard(XQueryParser.RpWildcardContext ctx) {
        System.out.println("*"); // rule 4
        LinkedList<Node> nodes = new LinkedList<>();
        for (Node n : this.nodes) {
            nodes.addAll(Helper.children(n));
        }
        this.nodes = nodes;
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpCurr(XQueryParser.RpCurrContext ctx) {
        System.out.println("."); // rule 5
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpPrev(XQueryParser.RpPrevContext ctx) {
        System.out.println(".."); // rule 6
        LinkedList<Node> nodes = new LinkedList<>();
        for (Node n : this.nodes) {
            nodes.add(Helper.parent(n));
        }
        this.nodes = nodes;
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpText(XQueryParser.RpTextContext ctx) {
        System.out.println("text()"); // rule 7
        LinkedList<Node> nodes = new LinkedList<>();

        for (Node n : this.nodes) {
            //System.out.println(n.toString());
            nodes.addAll(Helper.txt(n));
        }
        this.nodes = nodes;
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpAttribute(XQueryParser.RpAttributeContext ctx) {
        System.out.println("attName"); // rule 8
        LinkedList<Node> nodes = new LinkedList<>();
        String attName = ctx.Identifier().getText();
        for (Node n : this.nodes) {
            Element e = (Element) n;
            if (e.hasAttribute(attName)) {
                nodes.add(((Element) n).getAttributeNode(attName));
            }
        }
        this.nodes = nodes;
        return nodes;
    }

    @Override
    public LinkedList<Node> visitRpParentheses(XQueryParser.RpParenthesesContext ctx) {
        System.out.println("()"); // rule 9
        this.nodes = visit(ctx.rp());
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpSingleSlash(XQueryParser.RpSingleSlashContext ctx) {
        System.out.println("/"); // rule 10
        // since RpSingleSlash must have two children, first visited left one, then right one

        visit(ctx.rp(0));
        this.nodes = Helper.unique(visit(ctx.rp(1)));
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpDoubleSlash(XQueryParser.RpDoubleSlashContext ctx) {
        System.out.println("//"); // rule 11
        visit(ctx.rp(0));

        // find all descOrSelf
        LinkedList<Node> res = (LinkedList) this.nodes.clone();
        while (!res.isEmpty()) {
            Node n = res.pollFirst();
            LinkedList<Node> children = Helper.children(n);
            this.nodes.addAll(children);
            res.addAll(children);
        }

        this.nodes = Helper.unique(visit(ctx.rp(1)));
        return this.nodes;
    }


    @Override
    public LinkedList<Node> visitRpFilter(XQueryParser.RpFilterContext ctx) {
        System.out.println("[ ]"); // rule 12
        LinkedList<Node> nodes = new LinkedList<>();
        LinkedList<Node> tmp = visit(ctx.rp());
        for (Node n : tmp) {
            // update this.nodes for each recursion
            LinkedList<Node> each = new LinkedList<>();
            each.add(n);
            this.nodes = each;
            if (!visit(ctx.f()).isEmpty()) {
                nodes.add(n);
            }
        }
        this.nodes = nodes;
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitRpPair(XQueryParser.RpPairContext ctx) {
        System.out.println(","); // rule 13
        LinkedList<Node> preStatus = this.nodes;
        LinkedList<Node> left = visit(ctx.rp(0));
        this.nodes = preStatus;
        LinkedList<Node> right = visit(ctx.rp(1));
        left.addAll(right);
        this.nodes = left;
        return this.nodes;
    }

    @Override
    public LinkedList<Node> visitFRelativePath(XQueryParser.FRelativePathContext ctx) {
        System.out.println("f: rp"); // rule 14
        // filter doesn't change the list!
        LinkedList<Node> preStatus = this.nodes;
        LinkedList<Node> filterResult = visit(ctx.rp());
        this.nodes = preStatus;
        return filterResult;
    }

    @Override
    public LinkedList<Node> visitFParentheses(XQueryParser.FParenthesesContext ctx) {
        System.out.println("f: ()"); // rule 17
        return visit(ctx.f());
    }

    @Override
    public LinkedList<Node> visitFAnd(XQueryParser.FAndContext ctx) {
        System.out.println("f: and"); // rule 18
        if (!visit(ctx.f(0)).isEmpty() && !visit(ctx.f(1)).isEmpty()) {
            return this.nodes;
        }
        return new LinkedList<>();

    }

    @Override
    public LinkedList<Node> visitFOr(XQueryParser.FOrContext ctx) {
        System.out.println("f: or"); // rule 19
        if (!visit(ctx.f(0)).isEmpty() || !visit(ctx.f(1)).isEmpty()) {
            return this.nodes;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitFNot(XQueryParser.FNotContext ctx) {
        System.out.println("f: not"); // rule 20
        if (visit(ctx.f()).isEmpty()) {
            return this.nodes;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitFEqual(XQueryParser.FEqualContext ctx) {

        System.out.println("f: eq(=)"); // rule 15
        LinkedList<Node> preStatus = (LinkedList) this.nodes.clone();
        LinkedList<Node> left, right;
        LinkedList<Node> nodes = new LinkedList<>();
        left = visit(ctx.rp(0));
        this.nodes = preStatus;
        right = visit(ctx.rp(1));
        for (Node ln : left) {
            for (Node rn : right) {
                //System.out.println(ln.toString() + "???" + rn.toString());
                if (ln.isEqualNode(rn)) {
                    System.out.println("equal!");
                    nodes.add(ln);
                }
            }
        }

        return nodes;
    }


    @Override
    public LinkedList<Node> visitFSame(XQueryParser.FSameContext ctx) {

        System.out.println("f: is(==)"); // rule 16
        LinkedList<Node> preStatus = this.nodes;
        LinkedList<Node> left, right, nodes = new LinkedList<>();
        left = visit(ctx.rp(0));
        this.nodes = preStatus;
        right = visit(ctx.rp(1));
        for (Node ln : left) {
            for (Node rn : right) {
                if (ln.isSameNode(rn)) {
                    nodes.add(ln);
                }
            }
        }

        return nodes;
    }


}
