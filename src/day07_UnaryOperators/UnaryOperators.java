package day07_UnaryOperators;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
			/*
			 +:  positive
			 -:  negative
			 ++: increment
			 --: decrement
			 
			 +- ==> -
			 -- ==> +
			 ++ ==> +
			 -+ ==> -
			 
			 */
		
			int a = 10;
			int b = -10;
			System.out.println(b);
			
			int c = +b;  // +(-10)  ==> -10
			System.out.println(c);
			
			int d = - c;  // -(-10)  ==> 10
			System.out.println( d );
			
			// increments : increases a value by 1
			// pre increments: operator is placed before variable
			
			int num1 = 100;
			++num1;
			System.out.println(num1);  // either num1 or ++num1  ==> same result --> 101
			
			int num2 = ++num1;  // ++(101) ==> 102
			System.out.println(num2);
			
			// post increment: operator is placed after the variable
			
			int intNum = 100;
			
			
			System.out.println(intNum++);  //  100
			System.out.println(intNum);    //  101
			
			int intNum2 = intNum ++ ;  // intNum2
			System.out.println(intNum2++);
			System.out.println(intNum);  // 102
			
			int x = 100;
			int y = x++ - 1;
			//  y = 100 - 1;
			System.out.println( y );  //  99
			
			
			
			// decrement: decreases a value by 1
					// pre-decrement: operator is before the variable . Decrease the value immediately 
			
			int Z = 100;
				--Z;
			System.out.println( Z );
			
			// post-decrement: operator placed after the variable. It will pass current value, and then decrease
			
			int Y = 95;
			System.out.println(Y--);  // 95
			System.out.println(Y);    // 94
			
			
			int T = 25;
			System.out.println(++T);   // 26
			System.out.println(--T);   // 25   ,, not 24 because ++T replaced the value of T
			
			int P = 50;
			P = --P + P++ + P-- + P++;
			//  49  +  49  +  50  +  49
			//  = 197
			
			System.out.println( P );
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
