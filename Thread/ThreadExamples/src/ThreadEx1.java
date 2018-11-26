
public class ThreadEx1 extends Thread{
public void run()
{
	//it return the current thread properties
	Thread t=Thread.currentThread();
	t.setName("Andrew");
	//it return the nae of the thread
	System.out.println("Status of Thread is: "+t.isAlive());
	//it return the priority of the threads default priority of thread is 5
	System.out.println("Priority of the Thread is: "+t.getPriority());
	//it returns the thread object id
	System.out.println("Id of the Thread is: "+t.getId());
}
	public static void main(String[] args) {
		ThreadEx1 obj=new ThreadEx1();
		obj.start();

	}

}
