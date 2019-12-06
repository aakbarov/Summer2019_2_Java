package day00_practice;

import java.util.*;

public class happyValleySchoolSystem {
	
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	     System.out.println("-Display prompt: Enter age:");

	    int age = scan.nextInt();
	    
	    if (age==2) {
	    	System.out.println("-Display prompt: toddler");
	    }else if(age>=3 && age<=5) {
	    	System.out.println("-Display prompt: early childhood");
	    }else if(age>=6 && age<=7) {
	    	System.out.println("-Display prompt: young reader");
	    }else if(age>=8 && age<=10) {
	    	System.out.println("-Display prompt: elementary");
	    }else if(age>=11 && age<=12) {
	    	System.out.println("-Display prompt: middle");
	    }else if(age==13) {
	    	System.out.println("-Display prompt: impossible");
	    }else if(age>=14 && age<=16) {
	    	System.out.println("-Display prompt: high school");
	    }else if(age>=17 && age<=18) {
	    	System.out.println("-Display prompt: scholar");
	    }else {
	    	System.out.println("-Display prompt: ineligible");
	    }
	  }
}