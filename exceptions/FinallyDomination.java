package exceptions;

public class FinallyDomination {
	public static void main(String[] args) {
		try 
		{
			System.out.println("Try");
			System.out.println("User");
			System.exit(0);
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
