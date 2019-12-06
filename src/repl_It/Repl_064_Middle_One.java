package repl_It;

import java.util.Scanner;

public class Repl_064_Middle_One {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		int lngt = word.length();
	     int half = (word.length()/2);
	     
	    if (lngt%2!=0){
	      if (lngt >= 3) {
	        System.out.println(word.substring(half,half+1));
	      } 
	      if (lngt == 1) {
	        System.out.println(word.charAt(0)+""+word.charAt(0)+""+word.charAt(0));
	      }
	      
	      
	    } if (lngt%2==0) {
	       if (lngt >=4) {
	         System.out.println(word.substring(half-1,half +1));
	       }
	       if (lngt ==2) {
	         System.out.println(word + word);
	       }
	    
		}
	
	}

}
