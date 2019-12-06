package day00_practice;

import java.util.*;

public class ternarystatements {
	
	public static void main(String[] args) {
		
		int n1=15, n2=10;
		int max;
		
//		if(n1>n2) {
//			max=n1;
//		}else {
//			max=n2;
//		}
//		System.out.println(max);
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number1:");
				int num1 = scan.nextInt();
				System.out.println("Enter number2:");
				int num2 = scan.nextInt();
				int larger ;
				max = (num1>num2)?num1:num2;
				System.out.println();
				
		
		
		
//		max=(n1>n2)?n1:n2;
//		System.out.println(max);
//		
//		System.out.println("============");
//		
//		
//		String action;
//		
//		boolean isGreen = true;
//		
//		if(isGreen) {
//			action="Can drive";
//		}else {
//			action="Can't drive.";
//		}
//		System.out.println(action);
//		
//		action=(isGreen)? "Can Drive": "Can't Drive.";
//		System.out.println(action);
//		
	}

}
