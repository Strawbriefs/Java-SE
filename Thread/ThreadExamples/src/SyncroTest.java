class First
{
	public void display(String msg)
	{
		System.out.print("["+msg+"]");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("#");
		}
	}
}
class Second extends Thread
{
	String msg;
	First obj;
	Second(First f,String str)
	{
		obj=f;
		msg=str;
		start();
	}
	public void run()
	{
		synchronized(obj)//synchronized block to make sure to allow to access the rescource one after another thread object
		{
			obj.display(msg);
		}
	}
}
public class SyncroTest {

	public static void main(String[] args) {
		First first=new First();
		Second second=new Second(first,"Welcome");
		Second second1=new Second(first,"to");
		Second second2=new Second(first,"Fullstack");
		
		

	}

}
