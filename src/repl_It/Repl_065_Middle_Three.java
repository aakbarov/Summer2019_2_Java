package repl_It;

import java.util.Scanner;

public class Repl_065_Middle_Three {
	/*
	 * You have a word, do the following:
	 * 
	 * If the word has odd number of characters and has 5 or more characters, print
	 * the middle three characters of the word.
	 * 
	 * Otherwise print "invalid".
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter your word");
		String word = scan.next();

		int lngt = word.length();
		int half = lngt / 2;
		if (lngt % 2 == 1 && lngt >= 5) {
			System.out.println(word.substring(half - 1, half + 2));
		} else {
			System.out.println("invalid");

		}
	}

}
