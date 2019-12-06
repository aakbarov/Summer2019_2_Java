package repl_It;

import java.util.Scanner;

public class Repl_079_String_No_End {
	/*
	 * In this exercise you get a string called txt .
	 * 
	 * output txt without its last letter.
	 * 
	 * for example:
	 * 
	 * txt = "foo"
	 * 
	 * output will be: fo
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println();
		String txt = s.next();

		System.out.println(txt.substring(0, txt.length() - 1));
	}

}
