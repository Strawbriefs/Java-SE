//examples try with multiple catch block
public class TryWithMultiCatch {

	public static void main(String[] args) {
	
		try
		{
			//int value1=Integer.parseInt(args[0]);
			//int value2=Integer.parseInt(args[1]);
		String name=null;
			//int res=value1/value2;
			//System.out.println(res);
			System.out.println(name.length());
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Enter 2 input to get O/P");
		}
		catch(NumberFormatException e1)
		{
			e1.printStackTrace();
		}
		catch(ArithmeticException e2)
		{
			System.err.println("Dont Try Divided with Zero");
		}
		
		catch(Exception e4)
		{
			System.out.println(e4.toString());
		}
	}

}
