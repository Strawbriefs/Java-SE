package ListProgram;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// created a object for arraylist class to store multiple element into single objects
		ArrayList al=new ArrayList();
		System.out.println("Size of ArrayList: "+al.size());
		al.add("Andrew");
		al.add("Sashi");
		al.add("Gaurav");
		al.add(45);
		al.add(76);
		al.add(71);
		al.add('A');
		al.add('B');
		al.add('C');
		System.out.println("After add the Records: "+al.size());
		al.add(2,"kunal");
		al.remove(5);
		System.out.println(al);
		al.remove("Sashi");
		System.out.println("After Delete the Records: "+al.size());
		al.add(0,"Bilal");
		al.set(4,"New");
		System.out.println(al);
		Iterator itr=al.iterator();
		//hasNext() is going to check element is exist or not in the specific index
		while(itr.hasNext())
		{
			//next() is going to return the values from the index
			System.out.println(itr.next());
		}
		
		
	}

}
