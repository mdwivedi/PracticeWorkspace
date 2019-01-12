package Trees;

public class Node {

    private String data;
    private  Node child;
    private  Node sibling;
    private  Node parent;
    private  int level;

    public Node(String data, Node child, Node sibling, Node parent, int level) {
        this.data = data;
        this.child = child;
        this.sibling = sibling;
        this.parent = parent;
        this.level = level;
    }

    public Node() {
        data = null;
        child = null;
        sibling = null;
        parent = null;
        this.level = 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getChild() {
        return child;
    }

    public void setChild(Node child) {
        this.child = child;
    }

    public Node getSibling() {
        return sibling;
    }

    public void setSibling(Node sibling) {
        this.sibling = sibling;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
