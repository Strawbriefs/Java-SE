package SetExample;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet <Character>emp_grade=new TreeSet<>();
		emp_grade.add('A');
		emp_grade.add('B');
		emp_grade.add('E');
		emp_grade.add('D');
		emp_grade.add('C');
		System.out.println(emp_grade);
		//get the elements
		System.out.println("First Grade is: "+emp_grade.first());
		System.out.println("Last Grade is: "+emp_grade.last());
		//using iterator
		System.out.println("using iterator: ");
		Iterator<Character>itr=emp_grade.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}

	}

}
