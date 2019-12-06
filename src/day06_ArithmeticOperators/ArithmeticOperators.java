package day06_ArithmeticOperators;

public class ArithmeticOperators {

	 /*
	  + : addition
	  - : subtraction
	  * : multiplication
	  / : devision 
	  % : remainder
	  */
	
	public static void main(String[] args) {
		 int a = 100;
		 int b = a - 400;  // -300
		  
		 System.out.println(b);
		 
		 int c = a + b;  // 100+ -300 = -200
		 System.out.println(c);
		 

		 System.out.println( 3 + 4 + 5 - 2 );  // 10
		 
		 
		 int X = 3, Y = 5, Z = X * Y;
		 System.out.println(Z);
		 
		 double length = 100, wedith = 10, Area = length/wedith;
		 System.out.println(Area);
		 
		 double Number1 = 10 / 3f;
		 System.out.println(Number1);
		 
		 double Number2 = 10 / 3.0;
		 System.out.println(Number2);
		 
		 int output = 12 + 6 / 3;
		 //           12 + 2 = 14
		 System.out.println(output);
		 
		 System.out.println( 5 + 4 * 2 );
		 System.out.println( 10 / 2 -3 );
		 
		 /*
		     10/3  => 3 with remainder of 1
		     12/5  => 2 with remainder of 2
		     
		  */
		
		 int result1 = 10%3;  // 1
		 
		 System.out.println( result1 );
		 
		 System.out.println( 12 % 5);
		 
		 System.out.println( 45 % 4);
		 
		 /*
		  20, 45, 65, 67, 68
		  
		  even: can be devided by 2 without a remainder
		  odd: can be devided by 2, have remainder
		  
		  */
		 
		 int Number20 = 20 % 2;
		 System.out.println( Number20);
		 
		 int Number45 = 45 % 2;  // 1
		 int Number65 = 65 % 2;  // 1
		 int Number67 = 67 % 2;  // 1
		 int Number68 = 68 % 2;  // 0
		 
		 System.out.println( (4 + 17) % 2 - 1 );
		 
		 System.out.println( 6 * 3 / 2 );
		 
		 double percentage = 10/100;  // 10%   0.1
		 
		 System.out.println(";resultb"+(1)+(2));
		  
		 
		 
		 
		 
		 
		 
		 
	}
}
