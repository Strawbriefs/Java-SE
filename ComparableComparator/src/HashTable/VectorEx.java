package HashTable;

import java.util.Enumeration;
import java.util.Vector;

//vector examples
//diff between vector and arraylist
//vector is synchronized where as arraylist is not a synchronized

public class VectorEx {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Andrew");
		v.add("Sashi");
		v.add("Ram");
		v.add("Nishanth");
		v.add("Bilal");
		v.add("Bilal");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
