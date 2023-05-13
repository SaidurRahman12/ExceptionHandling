package exceptions;

public class AbnormalTerminationRule1 {
	public static void main(String[] args) 
	{
		doStuff();
	}
	public static void doStuff()
	{
		domoreStuff();
	}
	public static void domoreStuff()
	{
		System.out.println("HELLO!");
		System.out.println(10/0);
	}

}
