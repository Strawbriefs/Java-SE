package HashTable;

import java.util.*;

//stack examples
//it follows last in and first out.
public class StackEx {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		Enumeration e=st.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		st.pop();
		st.pop();
		System.out.println("After Pop: ");
		Enumeration e1=st.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
