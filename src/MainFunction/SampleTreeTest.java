package MainFunction;
import Trees.*;
import java.util.*;


public class SampleTreeTest {

    public static void main(String [] args)
    {
        System.out.println("Welcome to Tree Program");
        String[] states = {"MP", "UP", "AP","MH","Delhi","HP", "GJ", "RJ", "PB"};

        Hashtable<String, Node> stateHash = new Hashtable<>();
        Tree newTree = new Tree();
        Node india = newTree.createTree("India", 0);

        for (String state : states) {
                  Node temp = newTree.addChild(india, state, 1);
                  if(temp != null) {
                      stateHash.put(state, temp);
                      System.out.println("Adding new to hashtable");
                  }
        }

        Set<String> keys = stateHash.keySet();
        String str;

        //Obtaining iterator over set entries
        Iterator<String> itr = keys.iterator();

        //Displaying Key and value pairs
        while (itr.hasNext()) {
            // Getting Key
            str = itr.next();



            System.out.println("Key: "+str+" & Value: "+stateHash.get(str));
        }









    }
}
