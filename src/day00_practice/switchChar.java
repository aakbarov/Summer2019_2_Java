package day00_practice;

import java.util.Scanner;

public class switchChar {
	
	
	  public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter command:");
	    char response = scan.next().charAt(0);
	    //WRITE YOUR CODE HERE 
	    switch(response){
	      case 1:
	        System.out.println("Your request is being processed");
	        break;
	      case 2:
	        System.out.println("Thank you anyway for your consideration");
	        break;
	      case 3:
	        System.out.println("Sorry, no help is currently available");
	        break;
	      default :
	        System.out.println("Invalid entry, please try again!");
	        break;
	    
			
	  }
	}

}
