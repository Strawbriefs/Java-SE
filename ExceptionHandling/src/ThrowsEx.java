
public class ThrowsEx {
	public int divide(int num1, int num2)throws Exception
	{
		return num1/num2;
	}

	public static void main(String[] args) {
		ThrowsEx obj=new ThrowsEx();
		
		try {
			System.out.println(obj.divide(12, 2));
			System.out.println(obj.divide(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Yes I understood..");
		}

	}

}
