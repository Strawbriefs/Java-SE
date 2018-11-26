//what happen if we are not handle the exception
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Before Exception...");
		try
		{
		int value=20/2;
		System.out.println(value);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		finally
		{
		System.out.println("Progam has finished up..");
		}
		}
		}


