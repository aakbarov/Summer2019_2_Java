package repl_It;

import java.util.*;

public class Repl_066_Merge_Them {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word 1: ");
		String word1 = scan.next();
		System.out.println("Enter word 2: ");
		String word2 = scan.next();
		// YOUR CODE HERE

		int lngt1 = word1.length();
		int lngt2 = word2.length();

		if (lngt1 != 3 || lngt2 != 3)
			System.out.print("cannot merge");
		else
			System.out.println(word1.charAt(0) + "" + word2.charAt(0) + "" + word1.charAt(1) + "" + word2.charAt(1) + ""
					+ word1.charAt(2) + "" + word2.charAt(2));

	}
}