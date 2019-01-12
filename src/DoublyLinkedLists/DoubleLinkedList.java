package DoublyLinkedLists;


/**
 *  This class is the implementation of doubly linked list
 */
public  class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    /**
     * @return Returns Head node of the list
     */
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return Returns tail node of the list
     */
    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertBeginning(int data)
    {
        Node new_node = new Node(data, null, null);
        if(head == null) {
            System.out.println("List is Emptry, create new list");
            head = new_node;
            tail = new_node;
            size = size++;
        }
        else {
            System.out.println("List already exists, entering at the start of the list");
            new_node.setNext(head);
            head.setPrevious(new_node);
            head = new_node;
            size++;
        }
    }

    public void insertNode(int data, int position)
    {
        if(head == null || position == 0)
        {
            insertBeginning(data);
        }
        else if(position >= size || position == -1) //insert in the end.
        {
            Node new_node = new Node(data, null, null);
            tail.setNext(new_node);
            new_node.setPrevious(tail);
            tail = new_node;
            size ++;
        }
        else
        {
            Node new_node = new Node(data, null, null);

            Node temp = head;
            for(int i = 0; i < (position -1); i++)
            {
                //Position :  0, 1, 2, 3, 4, 5, 6
                //Size : 1, 2, 3, 4, 5, 6
                temp = temp.getNext();
            }
            temp.setNext(new_node);
            new_node.setPrevious(temp);
            new_node.setNext(temp.getNext());
            size++;
        }

    }

    public void displayForward()
    {
        System.out.println("Display the list in forward direction");
        Node temp = head;
        do {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }while (temp != null);
    }

    public void displayReverse()
    {
        System.out.println("Display the list backword");
        Node temp = tail;
        do {
            System.out.println(temp.getData());
            temp = temp.getPrevious();
        }while (temp != null);
    }
}
