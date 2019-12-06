package repl_It;

import java.util.Scanner;

public class Repl_060_Verify_Contains {
	
	//Write a program that will verify if word contains in the sentence. Print out the result as boolean value.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your word");
		String word = scan.nextLine();
		System.out.println("enter your sentence");
		String sentence = scan.nextLine();
		
		System.out.println(sentence.contains(word));
	}

}
