import java.util.*;


class Node {
       protected  int data;
       protected Node next;

       public Node() {
           data = 0;
           next = null;
       }

       public  Node(int d, Node n)
        {
            data = d;
            next = null;
        }

        public int getData() {

           return data;
        }

        public void setData(int d)
        {
            data = d;
        }

        public  Node getNext() {
            return next;
        }

        public  void setNext(Node n) {
           next = n;
        }
    }

    class sList{

        private Node head = null;
        private int size = 0;

        public sList() {
            head = null;
            size = 0;
        }

        public sList(Node hd, int sz) {
            head = hd;
            size = sz;
        }

        public void insertNode(int mdata, int pos) {

            Node new_node = new Node(mdata, null);

            if(head == null) {
                System.out.println("List is empty right now. Creating Head");
                head = new_node;
                size = size++;
            }
            else {
                if(pos <= 0) {
                    System.out.println("Insert at the beginning of the list");
                    new_node.setNext(head);
                    head = new_node;
                    size = size++;
                } else if(pos < size) {
                    System.out.println("Insert somewhere mid in the list");
                    Node temp = head;
                    for(int i = 0; i <pos; i++)
                        temp = temp.getNext();
                    new_node.setNext(temp.getNext());
                    temp.setNext(new_node);
                    size++;
                }
                else {
                    System.out.println("Insert at the end of the list");
                        Node temp = head;
                        while (temp.getNext() != null) {
                            temp = temp.getNext();
                        }
                        temp.setNext(new_node);
                        size++;
                    }
                }
            }

        public void display() {

            Node temp = head;
            if(temp != null) {
                System.out.println("Display the list");
                while (temp != null) {
                    System.out.println(temp.getData());
                    temp = temp.getNext();
             }
            }
            else
                {
                 System.out.println("Nothing to display, list is EMPTY!!!");
                }
        }

    }
class LinkList2 {
    public static void main(String[] args)
    {
        sList list = new sList(null, 0);
        System.out.println("Welcome to Sample Linked List Program");
        System.out.println("Do you want to Continue : Y/N ? ");
        Scanner scan = new Scanner(System.in);
        char ch;
        do {
                System.out.println("Enter 1 to insert in the list");
                System.out.println("Enter 2 to delete from the list");
              System.out.println("Enter 3 to display the list");


                int choice = scan.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println("Please enter the data you want to add to the list");
                        int data = scan.nextInt();
                        System.out.println("Please enter the position on which you want to enter the node");
                        int position = scan.nextInt();
                        list.insertNode(data, position);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the position you want to delete the node");
                        int position = scan.nextInt();
                     //   list.deleteNode(position);
                        break;
                    }
                    case 3: {
                        list.display();
                        break;
                    }
                }

                System.out.println("Do you want to continue 'y/n'?");
                ch = scan.next().charAt(0);

            }while (ch == 'y' || ch == 'Y');
        }
    }
