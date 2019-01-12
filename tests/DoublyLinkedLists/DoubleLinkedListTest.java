package DoublyLinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLinkedListTest {



    @Test
    public void getHead() {
        DoubleLinkedList myList = new DoubleLinkedList(null, null,0 );
        myList.insertNode(250, 0);
        myList.insertNode(220, 0);
        myList.insertNode(20, 4);

        System.out.println(myList.getHead().getData());
    }

    @Test
    public void setHead() {
    }

    @Test
    public void getTail() {
    }

    @Test
    public void setTail() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void setSize() {
    }

    @Test
    public void insertBeginning() {
    }

    @Test
    public void insertNode() {
    }

    @Test
    public void displayForward() {
    }

    @Test
    public void displayReverse() {
    }
}