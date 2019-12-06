package repl_It;

import java.util.Scanner;

public class Repl_070_Alejandro_I {

	/*
	 * alejandro have started learning java, he knows what you know about ifs and
	 * strings.
	 * 
	 * he has a large number of text email, going trough all of them will take a
	 * lot of time. to save time he will only read the email that refer to him by
	 * name.
	 * 
	 * he wants to write a program that gets a string (the email) and determines if
	 * his name "alejandro" appears in that string. if so it will output
	 * "read this mail" else it will output "dont read".
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("emails go here");
		String a = s.nextLine();

		if (a.contains("alejandro")) {
			System.out.println("read this email");
		} else {
			System.out.println("dont read");
		}

	}

}
