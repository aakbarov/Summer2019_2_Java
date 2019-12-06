package day08_ShortHandOperators;

public class RelationalOperators {
	/*
	 Relational Operators : return boolean expressions
	 >  : greater than
	 >= : greater than or equal
	 <  : less than
	 <= : less than or equal
	 == : equal
	 != : not equal
	 =  : assign 
	 !  : logical opposite
	 
	 */
	
	public static void main(String[] args) {
		
		System.out.println( 10 > 9 );  // true
		boolean resultA = 10 > 9;
		System.out.println(resultA);
		
		System.out.println(10>=9);
		boolean resultB = 10>=9;
		
		System.out.println( 10 < 9 );
		boolean resultC = 10 < 9;
		
		System.out.println( 10 <= 9);
		boolean resultD = 10 <= 9;
		
		System.out.println( 10 == 9);
		boolean resultE = 10 == 9;
		
		System.out.println( 10 != 9);
		boolean resultF = 10 !=9;
		
		boolean A = true == !false;
		System.out.println(A);
		
		boolean B = !true;
		
		
		
		
		
	}

}
