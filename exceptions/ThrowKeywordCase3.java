package exceptions;

public class ThrowKeywordCase3{ //extends RuntimeException{
	public static void main(String[] args) {
		throw new ThrowKeywordCase3();
	}
}
// If we extends class into RuntimeException then it'll become child class of RuntimeException
// and we don't get compile error Only runtime exception occured saying Exception in thread main
// ThrowkeywordException.	

