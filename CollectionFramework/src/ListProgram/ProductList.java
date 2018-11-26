package ListProgram;

class ProductList {
int pid;
String pname;
float price;
int stock;
ProductList(int pid, String pname, float price, int stock)
{
	this.pid=pid;
	this.pname=pname;
	this.price=price;
	this.stock=stock;
}
@Override
public String toString() {
	return "ProductList [pid=" + pid + ", pname=" + pname + ", price=" + price + ", stock=" + stock + "]";
}
}
