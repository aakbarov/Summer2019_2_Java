package day00_practice;

import java.util.*;

public class apartmentLeasing {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice=0;
	    //WRITE YOUR CODE HERE
	    
	    if(numberOfBedrooms==1) {
	    	System.out.println("One Bedroom Selected");
	    	System.out.println("Starting Price: 110"+startingPrice);
	    }
	    else if(numberOfBedrooms==2) {
	    	System.out.println("Two Bedroom Selected");
	    	System.out.println("Starting Price: 185"+startingPrice);
	    }
	    else if(numberOfBedrooms==3) {
	    	System.out.println("Three Bedroom Selected");
	    	System.out.println("Starting Price: 255"+startingPrice);
	    }
	    else {
	    	System.out.println("No such Bedrooms available");
	    	System.out.println("Starting Price: "+startingPrice);
	    }
	}
    
  }
