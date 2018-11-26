
public class RunnableEx implements Runnable {

	public static void main(String[] args) {
		RunnableEx obj=new RunnableEx();
		Thread r=new Thread(obj);
		r.start();

	}
	@Override
	public void run() {
		for(int pos=1;pos<=5;pos++)
		{
			System.out.println("Thread is Running: "+pos+" "+"Thimes");
		}
	}

}
