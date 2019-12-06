package repl_It;

import java.util.Scanner;

public class Repl_063_Duplicate_It {
	/*
	 * You have 2 words Print the first word, second word, second word, first word
	 * 
	 * Input: one two Output: onetwotwoone
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter word1: ");
		String word1 = scan.next();
		System.out.println("enter word2: ");
		String word2 = scan.next();

		System.out.println(word1 + word2 + word2 + word1);

	}

}
