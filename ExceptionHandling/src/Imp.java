import java.util.*;
class EmpBonus extends Exception
{
	EmpBonus(String msg)
	{
		super(msg);
	}
}
class CheckBonus 
{
	public  static void checkBonus(char grade, int amount)throws EmpBonus
	{
		if(grade=='A' && amount==5000 || grade=='B'&& amount==4000 || grade=='C'&&amount==3000)
			System.out.println("Bonus Amount Has been Added Success..!!");
		else
			throw new EmpBonus("Amount Mismatch Exception..");
	}
}
class Imp
{
	public static void main(String args[])
	{
		CheckBonus object=new CheckBonus();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Emp Grade:");
		char grad=sc.next().charAt(0);
		System.out.println("Enter the Emp Bonus Amount You Want to Add:");
		int amt=sc.nextInt();
		try
		{
		CheckBonus.checkBonus(grad,amt);
		}
		catch(EmpBonus e)
		{
			e.printStackTrace();
		}
	}
}