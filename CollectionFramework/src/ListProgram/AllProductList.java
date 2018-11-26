package ListProgram;
import java.util.*;
public class AllProductList {

	public static void main(String[] args) {
		ProductList first=new ProductList(101,"HP Laptop",45000,6);
		ProductList second=new ProductList(102,"HP Laptop",42000,10);
		ProductList third=new ProductList(103,"HP Laptop",40000,11);
		ProductList last=new ProductList(104,"HP Laptop",47000,4);
		ArrayList<ProductList> obj=new ArrayList<>();//here we create a type safe object by using the generics
		obj.add(first);
		obj.add(second);
		obj.add(third);
		obj.add(last);
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			ProductList val=(ProductList)itr.next();
			System.out.println(val);
		}
		

	}

}
