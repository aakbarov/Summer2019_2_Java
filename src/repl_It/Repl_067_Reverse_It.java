package repl_It;

import java.util.Scanner;

public class Repl_067_Reverse_It {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE

		int lngt = word.length();

		if (lngt < 5) {
			System.out.println("Too short!");
		}
		if (lngt > 5) {
			System.out.println("Too long!");
		}
		if (lngt == 5) {

			String Reversed = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				Reversed += word.charAt(i);

			}
			System.out.println(Reversed);
		}
	}
}