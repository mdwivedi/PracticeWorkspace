import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void getData() {
        Node myNode = new Node(234, null);
        assertEquals(Integer.valueOf(234), Integer.valueOf(myNode.getData()));
    }

    @Test
    public void setData() {
        Node myNode = new Node(0, null);
        myNode.setData(357);

        assertEquals(Integer.valueOf(357), Integer.valueOf(myNode.getData()));
    }

    @Test
    public void getNext() {
    }

    @Test
    public void setNext() {
    }
}