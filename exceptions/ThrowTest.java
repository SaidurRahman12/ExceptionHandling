package exceptions;

public class ThrowTest {
	public static void main(int age) {
		if (age<18) {
			throw new ArithmeticException("You're not eligible to vote.");
		}
		else {
			System.out.println("You're eligible to vote.");
			
		}
	}
public static void main(String[] args) {
	main(19);
	System.out.println("Rest of the code...");
}
}
