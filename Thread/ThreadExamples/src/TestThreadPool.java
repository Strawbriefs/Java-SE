import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
	private String message;
	public WorkerThread(String s)
	{
		this.message=s;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"(Start)message= "+message);
		processmessage();//call the processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName()+"(end)");//print the thread name
	}
	private void processmessage()
	{
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
public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);//creating a new pool for 5 threads
		for(int pos=0;pos<10;pos++)
		{
			Runnable worker=new WorkerThread(""+pos);
			executor.execute(worker);//calling execute method of executorservice
		}
		executor.shutdown();
		//System.out.println("Finished All the threads");
	}

}
