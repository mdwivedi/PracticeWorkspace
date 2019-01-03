package DoublyLinkedLists;

public class Node {

    private  int data;
    private Node next;
    private Node previous;

    public Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
