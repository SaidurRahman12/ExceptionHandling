package exceptions;

public class ThrowsKeywordCase2 extends Throwable{
	public static void main(String[] args) throws ThrowsKeywordCase2{
//		System.out.println("User defined");
	}
	
}
// We can Throws keyword only for Throwable types. If we are trying to use it for Non-Throwable
// type immediately compile time error we are going to get error.So by extending Throwable it'll
// executed.