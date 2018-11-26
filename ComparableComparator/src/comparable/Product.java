package comparable;

import java.util.Scanner;

public class Product implements Comparable<Product>{
	int pid;
	String pname;
	float price;
	Product(int pid, String pname, float price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	@Override
	public int compareTo(Product p) {
		if(price==p.price)
			
			return 0;
		else if(price>p.price)
			return 1;
		else
			return -1;
	}
	/*public void addItem()
	{
		Scanner sc=new Scanner(System.in);
		for(int pos=1;pos<=3;pos++)
		{
			System.out.println("Enter Item Details: "+pos);
			System.out.println("Enter the Item ID: ");
			pid=sc.nextInt();
			System.out.println("Enter the Item Name:");
			pname=sc.next();
			System.out.println("Enter the Item Price: ");
			price=sc.nextFloat();
		}
	}*/
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}
