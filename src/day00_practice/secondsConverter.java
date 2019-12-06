package day00_practice;

import java.util.Scanner;

public class secondsConverter {
	
	public static void main(String[] args) {
		
	//	int  hours, minutes, seconds;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter seconds: ");
		
		int second = scan.nextInt();
		
		
		int hours = (second/60)/60;
		int minutes = (second/60)%60;
		
		second=(second%60);
		
		System.out.println(hours+" hours, "+minutes+" minutes, and "+second+" second.");
		
		
		
		
	}

}
