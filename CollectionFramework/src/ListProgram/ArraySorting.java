package ListProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {
		ArrayList id_num=new ArrayList();
		id_num.add(101);
		id_num.add(103);
		id_num.add(102);
		id_num.add(100);
System.out.println(id_num);
//soring the elements
Collections.sort(id_num);
System.out.println("After Sorting the elements: "+id_num);

Collections.reverse(id_num);
System.out.println("After Reverse the elements: "+id_num);

		

	}

}
