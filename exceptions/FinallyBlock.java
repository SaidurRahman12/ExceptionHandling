package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("Try");
		}
		catch(Exception e)
		{
			System.out.println("Catch");
		}
		finally
		{
			System.out.println("Finally");
		}
	}

}
