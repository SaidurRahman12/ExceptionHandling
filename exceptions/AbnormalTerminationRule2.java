package exceptions;

public class AbnormalTerminationRule2 {
	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		System.out.println(10/0);
	}
	public static void domoreStuff() {
		System.out.println("HELLO !");
	}

}
