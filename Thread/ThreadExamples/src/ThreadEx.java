
public class ThreadEx extends Thread{
	public void run()
	{
		for(int pos=0;pos<=5;pos++)
		{
			System.out.println("Thread is Runing: "+pos+" "+"Times");
		}
	}

	public static void main(String[] args) {
		ThreadEx obj=new ThreadEx();
		ThreadEx obj1=new ThreadEx();
		System.out.println("First Thread Started: ");
		obj.start();
		System.out.println("Second Thread Started: ");
		obj1.start();
	}

}
