import java.util.Scanner;

public class ThrowExample {
	public static void checkAge()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age to Check Eligible:");
		int age=sc.nextInt();
		System.out.println("Do You have Your Voter ID Card:");
		String option=sc.next();
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible for Vote");
		}
		else if(age>=18 && option.equals("no"))
		{
			throw new NumberFormatException("Please Collect Your Voted Card");
		}
		else
		{
			System.out.println("Eligible for Vote");
		}
	}

	public static void main(String[] args) {
		
		ThrowExample.checkAge();

	}

}
