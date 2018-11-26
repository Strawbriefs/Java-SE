import java.util.Scanner;
//custom exception examples
class WithDrawException extends Exception
{
	
	WithDrawException(String message)
	{
		super(message);
	}
}
public class WithDraw {
	public void withdrawAmount(int amount)throws WithDrawException
	{
		float bank_balance=5000;
		if(amount>5000)
		{
			throw new WithDrawException("You Dont have Sufficient Amount..");
		}
		else
		{
			System.out.println("Balance is: "+(bank_balance-amount));
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to ATM");
		System.out.println("===============");
		System.out.println("Please Enter the Amount you want to Withdraw:");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		WithDraw obj=new WithDraw();
			try {
			obj.withdrawAmount(amt);
		} catch (WithDrawException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
