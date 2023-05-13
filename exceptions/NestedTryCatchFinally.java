package exceptions;

public class NestedTryCatchFinally {
	public static void main(String[] args) {
		try
		{
			System.out.println("Try use");
			try
			{ 
				System.out.println("Inner try Use");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Inner catch use");
			}
			System.out.println("Outside inner try");
		}
		catch(Exception e)
		{
			System.out.println("Outer catch use");
		}
		finally
		{
			System.out.println("Outer finally use");
		}
	}
}
