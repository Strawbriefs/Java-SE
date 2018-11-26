package Map;
import java.util.*;
public class TreeMapEx {

	public static void main(String[] args) {
		/*TreeMap<Integer,Double> empsal=new TreeMap<Integer,Double>();
		empsal.put(101,23000.00);
		empsal.put(102, 13000.00);
		empsal.put(103, 2000.00);
		empsal.put(104, 27000.00);
		System.out.println("Get All the Key: "+empsal.keySet()+" All the Values: "+empsal.values());
		for(Map.Entry<Integer,Double> e:empsal.entrySet())
		{
			System.out.println("Emp ID: "+e.getKey()+" Emp Sal: "+e.getValue());
		}*/
		TreeMap<Integer,Integer> empsal=new TreeMap();
		//treeset object will allow to sorting the elements in the form of key not values
		empsal.put(3,2300);
		empsal.put(2, 1300);
		empsal.put(5, 200);
		empsal.put(4, 2700);
		empsal.put(5, 2700);
		System.out.println("Get All the Key: "+empsal.keySet()+" All the Values: "+empsal.values());
		for(Map.Entry<Integer,Integer> e:empsal.entrySet())
		{
			System.out.println("Emp ID: "+e.getKey()+" Emp Sal: "+e.getValue());
		}
		
		

	}

}
