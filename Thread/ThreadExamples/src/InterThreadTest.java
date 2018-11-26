class Customer
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to Withdraw..");
		if(this.amount<amount)
		{
			System.out.println("Less Balance Waiting for Deposit");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		this.amount=amount;
		System.out.println("withdraw Completed");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to Deposit..");
		this.amount+=amount;
		System.out.println("Deposit completed..");
		notify();
	}
}
public class InterThreadTest {

	public static void main(String[] args) {
		Customer obj=new Customer();
		new Thread()
		{
			public void run()
			{
				obj.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				obj.deposit(10000);
			}
		}.start();

	}

}
