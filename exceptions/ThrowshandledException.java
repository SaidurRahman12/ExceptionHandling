package exceptions;

public class ThrowshandledException {
	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(1000);
//		System.out.println("I slept well");
	}

}
// By using Throws keyword we can handled exception by delegating responsibility of exception
// handling to the caller.After that caller is responsible for the Exception.