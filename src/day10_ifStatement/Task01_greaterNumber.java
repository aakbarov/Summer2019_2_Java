package day10_ifStatement;

public class Task01_greaterNumber {
	
	public static void main(String[] args) {
		
		 int num1=50;
	     int num2=80;
	     int max = 0;
	        
	     if( num1 > num2 ) {  // false
	            
	    	 max = num1;
	        		        		            
	        }
	        
	        
	      if( num2 > num1 ) {  // true
	            
	          max = num2;
	          
	        }
	        
	        System.out.println("Maximum number is: "+max);
	}	        
	        
}
