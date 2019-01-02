import com.sun.tools.hat.internal.util.VectorSorter;

import javax.naming.ldap.HasControls;
import java.util.Hashtable;
import java.util.Vector;

public class Main {

    public static void main(String[] args)
    {
        int mA[] = new int[] {1, 200, 2000};
        Vector<String> mV = new Vector();
        mV.addElement("Manish Test");
        mV.addElement("Rohit Test");

        Hashtable<String, String> mH = new Hashtable();

        mH.put("zero", "Manish Hash");
        mH.put("one", "Rohit Hash");



        System.out.println("Manish Array" + mA[1]);
        System.out.println("Manish Vector" + mV.elementAt(1));
        System.out.println(("Manish Hash"+ mH.get("zero")));

    }

}
