
public class TestDaemon extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon());
		{
		System.out.println("Daemon thread is working");	
		}
	    {
			System.out.println("It is a user thread");
		}
	}
	public static void main(String[] args) {
		TestDaemon obj=new TestDaemon();
		TestDaemon obj1=new TestDaemon();
		TestDaemon obj2=new TestDaemon();
		obj.setDaemon(true);//now it is a daemon thread objects
		obj.start();
		obj1.start();
		obj2.start();
		

	}

}

