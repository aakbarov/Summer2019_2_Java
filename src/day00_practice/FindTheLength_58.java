package day00_practice;

import java.util.Scanner;

public class FindTheLength_58 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the text:");
		
		String str = scan.nextLine();
		
		int num = str.length();
		
		System.out.println("Length is: "+ num);
		
	}

}
