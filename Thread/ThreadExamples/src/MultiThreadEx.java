class ThreadOne extends Thread
{
	//@SuppressWarnings("static-access")
	public void run()
	{
		Thread t=Thread.currentThread();
		t.setName("FirstThread");
		for(int pos=1;pos<=5;pos++)
		{
			System.out.println(t.getName()+" Runing is "+pos+" "+"Times");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class ThreadTwo extends Thread
{
	//@SuppressWarnings("static-access")
	public void run()
	{
		Thread t1=Thread.currentThread();
		t1.setName("SecondThread");
		for(int pos=5;pos>=1;pos--)
		{
			System.out.println(t1.getName()+" Running in "+pos+" Times ");
		}
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}
public class MultiThreadEx {

	public static void main(String[] args) {
		ThreadOne obj=new ThreadOne();
		ThreadTwo obj1=new ThreadTwo();
		System.out.println("First Thread has been Started: ");		
		obj.start();
		System.out.println("Status of the first thread: "+obj.isAlive());
		try
		{
			//first it will get into the process to complete its task and other threads should not interrupt
			obj.join();
			//yield() will try to find out is there any other threads has to perform with same priority 
			//so it will give chance to that thread also to perform otherwise the current thread will continue to execute
			//obj.yield();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Status of second thread: "+obj.isAlive());
		obj1.start();
		System.out.println("Second Thread has been Started: ");
		System.out.println("Status of Second Thread: "+obj.isAlive());
	}

}
