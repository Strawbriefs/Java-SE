
public class ThreadPriorityEx extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) {
		ThreadPriorityEx obj=new ThreadPriorityEx();
		ThreadPriorityEx obj1=new ThreadPriorityEx();
		ThreadPriorityEx obj2=new ThreadPriorityEx();
		//set the name all the threads
		obj.setName("First");
		obj1.setName("Second");
		obj2.setName("Third");	
		//set the priority all the threads
		obj.setPriority(NORM_PRIORITY);
		obj1.setPriority(MAX_PRIORITY);
		obj2.setPriority(MIN_PRIORITY);
		//start the threads
		obj.start();
		obj1.start();
		obj2.start();

	}

}
