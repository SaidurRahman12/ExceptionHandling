package exceptions;

public class TryCatchFinallyControlFlow {
	public static void main(String[] args) {
		System.out.println(10/0);
		try
		{
			System.out.println("Try");
			System.out.println("User");
//			System.out.println(10/0);
		}
		catch(Exception e)
		{			
			System.out.println("Catch");
//		    System.out.println(10/0);
		}
		finally
		{
			System.out.println("FINALLY");
		}
		System.out.println(10/0);
	}
}