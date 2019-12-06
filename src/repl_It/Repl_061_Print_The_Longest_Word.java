package repl_It;

import java.util.Scanner;

public class Repl_061_Print_The_Longest_Word {

	public static void main(String[] args) {
		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		// WIRTE YOUR CODE HERE

		int wordOne = word1.length();
		int wordTwo = word2.length();

		if ( wordOne > wordTwo ) {
			System.out.println(word1);
		}
		if ( wordTwo > wordOne ) {
			System.out.println(word2);
		}
	}

}
