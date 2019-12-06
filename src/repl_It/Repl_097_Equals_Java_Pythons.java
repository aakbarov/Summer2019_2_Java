package repl_It;

import java.util.Scanner;

public class Repl_097_Equals_Java_Pythons {
	/*
	 * Given a string, print out true if the number of appearances of "java"
	 * anywhere in the string is equal to the number of appearances of "python"
	 * anywhere in the string (case sensitive).
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println();
		String sentence = scan.nextLine();

		int countj = 0;
		int countp = 0;
		while (sentence.contains("java")) {
			sentence = sentence.replaceFirst("java", " ");
			countj += 1;
		}
		while (sentence.contains("python")) {
			sentence = sentence.replaceFirst("python", " ");
			countp += 1;
		}

		if (countj == countp) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
