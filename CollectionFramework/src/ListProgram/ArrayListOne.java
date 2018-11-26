package ListProgram;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add("Java");
		al1.add("J2ee");
		al1.add("Oracle");
		al1.add("Hadoop");
		
		ArrayList al2=new ArrayList();
		al2.add("Java");
		al2.add("Angular JS");
		al2.add("Node JS");
		al2.add("Hadoop");
		//check the elements is exit or not
		System.out.println("Item is exit or not: "+al1.contains("J2ee")+"&"+al2.contains("Java"));
		
//adding the both array list object into one
		//al1.addAll(al2);
		//System.out.println(al1);
		//removing the duplicate dlements
		//System.out.println(al2.retainAll(al1));
		al1.retainAll(al2);
		System.out.println(al1);
	}

}
