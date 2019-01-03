package LinkedLists;


public  class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

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
        Node new_node = new Node(data, null);
        if(head == null) {
            System.out.println("List is Emptry, create new list");
            head = new_node;
            tail = new_node;
            size = size++;
        }
        else {
            System.out.println("List already exists, entering at the start of the list");
            new_node.setNext(head);
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
            Node new_node = new Node(data, null);
            tail.setNext(new_node);
            tail = new_node;
            size ++;
        }
        else
        {
            Node new_node = new Node(data, null);

            Node temp = head;
            for(int i = 0; i < (position -1); i++)
            {
                //Position :  0, 1, 2, 3, 4, 5, 6
                //Size : 1, 2, 3, 4, 5, 6
                temp = temp.getNext();
            }
            temp.setNext(new_node);
            new_node.setNext(temp.getNext());
            size++;
        }

    }

    public void display()
    {
        Node temp = head;
        do {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }while (temp != null);
    }
}
