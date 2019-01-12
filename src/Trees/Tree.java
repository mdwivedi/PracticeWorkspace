package Trees;

public class Tree {

    private  int height;
    private Node root;

    public Tree(int height, Node root) {
        this.height = height;
        this.root = root;
    }

    public Tree() {
        this.height = -1;
        this.root = null;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node createTree(String d, int level)
    {
        if(root == null)
        {
            System.out.println("Tree is empty, creating tree");
            Node new_node = new Node(d, null, null, null, 0);
            root = new_node;
            height = 0;
            return new_node;
        }

        return null;
    }

    public Node addChild(Node n, String d, int l)
    {
       if(n.getChild() == null)
       {
           Node new_node = new Node(d, null, null, n, l);
           n.setChild(new_node);
           this.height++;
           System.out.println("Tree height increased by 1");
           return new_node;

       }
       else
       {
          // System.out.println("Adding sibling");
           return (this.addSibling(n.getChild(), d,l));
       }


    }

    public Node addSibling(Node n, String d, int l)
    {
        Node new_node = new Node(d, null,null, n.getParent(), l);

        Node temp = n;
        while(temp.getSibling()!=null)
        {
            temp = temp.getSibling();
        }
        temp.setSibling(new_node);
        return new_node;

    }


}
