import java.util.*;

public class ArrayVector {

     public  static void main(String[] agrs)
     {
         int tempArray[] = new int[] {1, 3, 4, 710};
         Vector<String> tempVector = new Vector<>();

         tempVector.addElement("Manish Temp");
         tempVector.addElement("Rohit Temp");
         tempVector.addElement("Shipra Temp");

         System.out.println("Array out" + tempArray[3]);
         System.out.println("Vector out" + tempVector.lastElement());
         System.out.println("Vector out" + tempVector.get(0));

         Hashtable<String, String> tempHash = new Hashtable<>();
         tempHash.put("zero", "My name is DON");
         tempHash.put("one", "My name is Karlos");
         tempHash.put("two", "My name is Sambha");

         System.out.println("Hash output " + tempHash.get("zero"));
         System.out.println("Hash output " + tempHash.get("one"));

     }

    }

