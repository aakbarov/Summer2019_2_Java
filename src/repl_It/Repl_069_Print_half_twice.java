package repl_It;

import java.util.Scanner;

public class Repl_069_Print_half_twice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = scan.next();
		// WRITE YOUR CODE HERE
		int lngt = word.length();
		int half = lngt / 2;
		System.out.println(word.substring(0, half) + "" + word.substring(0, half));

	}
}
