import org.junit.Test;

import static org.junit.Assert.*;

public class sListTest {
    public sList test_slist = new sList();

    @Test
    public void insertNode() {

        int[] data = { 50, 100, 200, 454, 868, 9230, 1, 2003};
        int [] pos = {-2, 0 , 5 , 2, -3, 4, 1, 6 };
        for(int i = 0; i < data.length; i++)
        {
           test_slist.insertNode(data[i], pos[i]);
        }

        System.out.println("Display the Linked List");
        test_slist.display();
    }

}