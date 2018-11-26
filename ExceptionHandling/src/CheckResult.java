//examples of throws keyword
import java.io.IOException;
import java.util.*;
public class CheckResult {
	public void checkResults()throws Exception, IOException
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Total Marks to know Result:");
	int total_marks=sc.nextInt();
	if(total_marks<100)
	{
		throw new IOException("You are FAIL..");
	}
	}
	

	public static void main(String[] args) throws Exception {
		CheckResult obj=new CheckResult();
	
			obj.checkResults();
		
		}

	}


