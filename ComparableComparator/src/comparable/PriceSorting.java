package comparable;
import java.util.ArrayList;
import java.util.Collections;

public class PriceSorting {

	public static void main(String[] args) {
		/*Product p=new Product(101,"Dell Laptop", 34200);
		Product p1=new Product(102,"HP Laptop", 45000);
		Product p2=new Product(103,"Lenovo Laptop", 42000);
		Product p3=new Product(104,"IBM Laptop", 32000);
		ArrayList<Product> a1=new ArrayList();
		a1.add(p);
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		Collections.sort(a1);
		for(Product obj:a1)
		{
			System.out.println(obj.pname+" "+obj.price);
		}*/
		Product p=new Product(101,"Dell Laptop", 34200);
		Product p1=new Product(102,"HP Laptop", 45000);
		Product p2=new Product(103,"Lenovo Laptop", 42000);
		Product p3=new Product(104,"IBM Laptop", 32000);
		ArrayList<Product> a1=new ArrayList();
		a1.add(p);
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		Collections.sort(a1);
		for(Product obj:a1)
		{
			System.out.println(obj.pname+" "+obj.price);
		}
		

	}

}
