package ListProgram;
import java.util.*;

public class GenericsExample {

	public static void main(String[] args) {
		ArrayList <String>studentname=new ArrayList<>();
		studentname.add("Sashi");
		studentname.add("Ram");
		studentname.add("Andrew");
		studentname.add("Shyam");
		ArrayList <String>address=new ArrayList<>();
		address.add("Texas");
		address.add("New Jersey");
		studentname.addAll(address);//it add the address into the first objects
		//travers the elements from studentname
		//retrive the element is foreach
		System.out.println("Display Records using foreach: ");
		for(String obj:studentname)
		{
			System.out.println(obj);
		}
		ListIterator itr=studentname.listIterator();
		//we retrive the elements in forward direction
		System.out.println("All record in Forward Direction: ");
		while(itr.hasNext())
		{
			String value=(String)itr.next();
			System.out.println(value);
		}
		//retrive the elements in backward direction
		System.out.println("All the records in Backward Direction: ");
		//ListIterator li=studentname.listIterator();
		while(itr.hasPrevious())
		{
			String value=(String)itr.previous();
			System.out.println(studentname.size());
		}
		
		//check element from studentlist obj
		System.out.println("Texas City is Exist or Not ?"+studentname.contains("Texas"));
		//clear the elements
		studentname.clear();
		System.out.println(studentname.size());
	}

}
