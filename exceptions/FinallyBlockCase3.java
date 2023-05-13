package exceptions;

public class FinallyBlockCase3 {
	public static void main(String[] args) {
		try {
			System.out.println("Try");
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("Catch");
		}
		finally
		{
			System.out.println("Finally");
		}
	}

}
