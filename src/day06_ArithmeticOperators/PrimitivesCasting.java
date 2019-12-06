package day06_ArithmeticOperators;

public class PrimitivesCasting {
	
	/*
	 casting: converting larger primitive to smaller size
	 			datatype variablename = (datatype) value
	 			
	 			castings: explicit & implicit
	 			
	 primitives: byte, short, int, long, float, double
	 
	 */
	
	public static void main(String[] args) {
		
	// explicit: is used when we are converting from larger type to smaller type
							/* Ex:
							 *  int a = 10
							 *  byte b = (byte)a;
							 */
							
		
		int a = 10;
		byte b = (byte) a;   // explicit casting
		System.out.println(b);
		
		
		double DecimalNumber = 10.5;
		float FloatNumber = (int) DecimalNumber; // double > float
			// FloatNumber = 10;
		
		System.out.println(FloatNumber);
		
	long LongNum = 300L;
	
	int IntNum = (short) LongNum;
	
		System.out.println(IntNum);
		
	
	// implicit casting: Automatic casting from smaller primitive type into larger primitive type
					/* Ex:
					 * byte a = 10;
					 * int b = a; automatically casts
					 */
		
					byte ByteNum = 10;
					int IntNum2 = ByteNum;

						// same with:
					int IntNum3 = (int) ByteNum;
					
					
			short ShortNum = 100;
				long LongNum2 = ShortNum;
					// same with:
				long LongNum3 = (long)ShortNum;
				
		// explicit casting practices:
				double LargestNumber = 100.8765;
				
				byte ByteValue = (byte) LargestNumber;
				//                        100
				
				float FloatValue = (float) LargestNumber;
				//                          100.8765F
				
				float FloatValue2 = (long) LargestNumber;
				float FloatValue3 = (int) LargestNumber;
				float FloatValue4 = (short) LargestNumber;
				float FloatValue5 = (byte) LargestNumber;
				
				System.out.println(FloatValue);  //  100.8765
				System.out.println(FloatValue2);  //  100.0
				System.out.println(FloatValue3);  //  100.0
				System.out.println(FloatValue4);  //  100.0
				System.out.println(FloatValue5);  //  100.0
				
				float FloatNumber2 = 500.67F;
				
				int myNumber = (short)FloatNumber2;
				//                 500
				
				System.out.println( myNumber );
				
				/*
				int Num1 = 100;
				int Num2 = 200;
				int Num3 = 300;
				*/
								
				int Num1 = 100, Num2 = 200, Num3 = 300;
				
				System.out.println(Num1 +"\t"+ Num2 + "\t"+ Num3);
				
				boolean result;
			//  System.out.println( result );  //  Local variables must be initialized 
				
				char Character1 = 'A';
				System.out.println(Character1);
				
				
				boolean result1, result2, result3;
				
			//	System.out.println(result1);  // local variables must be initialized
				
				
				
					
					
					
		
		
	}

}
