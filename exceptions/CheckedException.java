package exceptions;
import java.io.*;
public class CheckedException {
	public static void main(String[] args) {
		PrintWriter pw= new PrintWriter("abc.txt");
		pw.println("HELLO");
	}
}
