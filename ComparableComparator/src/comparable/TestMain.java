package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(new Student(1011,"Ramesh",23));
		obj.add(new Student(1012,"Ram",20));
		obj.add(new Student(1011,"Raj",21));
		obj.add(new Student(1011,"Rajesh",23));
		
		System.out.println("Sorting by Name: ");
	NameComparator name=new NameComparator();
		Collections.sort(obj, name);
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			Student s1=(Student)itr.next();
			System.out.println(s1.id+" "+s1.name+" "+s1.age);
		}
		
		System.out.println("Sorting by Age: ");
		AgeComparator age=new AgeComparator();
		Collections.sort(obj,age);
		Iterator itr1=obj.iterator();
		while(itr1.hasNext())
		{
			Student s2=(Student)itr1.next();
			System.out.println(s2.id+" "+s2.name+" "+s2.age);
		}

	}

}
