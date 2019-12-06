package day00_practice;

import java.util.Scanner;

public class ReadInput {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please print my name:");
		
		String firstName = input.next();
		
		System.out.println("Nice to meet you, " + firstName);
		
		System.out.println("How old are you?");
		
		int age = input.nextInt();
		
		System.out.println(age+", That's quite old!");
		
		System.out.println("Where are you from, "+firstName);
		
		String country = input.next();
		
		System.out.println(country+", Such a beautiful place!");
		
		System.out.println("Who is your brother?");
		
		String brother = input.next();
		
		System.out.println("How old is he?");
		
		int age2 = input.nextInt();
		
		System.out.println("What is he doing ?");
		
		String job = input.next();
		
		System.out.println(brother+"? Is he a good guy ?");
		
		System.out.println("He is the best!!");
		
	    
	
		
	}
	

}
