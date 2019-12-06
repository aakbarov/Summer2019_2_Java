package day03_Variables;

public class PrimitiveDataTypes {
	/*
	 byte: we can assign integers that's no decimal.  -128 <= byte <= 127
	 
	 short: we can only assign whole number. Must be within -32768 <= short <= 32767
	 
	 int: (used more often) we can only assign whole number. Must be within -2147483648 <= short <= 2147483647
	 
	 long: we can only assign whole number. Must be within -9223372036854775808 <= short <= 9223372036854775807
	 			at the end of value we can give l or L	
	 
	 			byte < short < int < long
	 			small one can be assigned to a larger one
	 			
	 			the variable dataType must be larger, in order to contain another datatype
	 			
	 float: we can assign decimals	(decimals must have f or F at the end)	
	 
	 double ( used more often): we can assign decimals.
	 
	 		float < double
	 			
	 */

	public static void main(String[] args) {
		
		byte length = 3;
		System.out.println(length);
		
		byte width = 4;
		System.out.println(width);
		
		// byte 9num = 100;
		
		byte num_and$ = 90;
		
		// variable names must start with a~z, or A~Z
		// variable names cannot contain any character other than "#" and "$"
		// variable names must be unique
		// variable names cannot be java reserved words
		
		// byte myNum1 = -129; out of byte range
		
		// byte myNum2 = 126;
		
		byte myNum3 = -127;
		
		// short num2 = &;   we can only assign whole numbers
		
		// short num3 =  10000;
		
		
		int num4 = -1000000000;
		
		// 100,000,000  no comma in java ,, only underscore 
		
		int num5 = 1_000_000_000; // easier to read, ( just like, in accounting) 
		
		
		long longNumber = 10L;
		
		// int intNumber = 10l;
		
		byte byteNumber = 10;
		short shortNumber = byteNumber;
		System.out.println(shortNumber);
		
		
		short shortNumber2 = 18;
		// byte byteNumber2 = shortNumber2;    the error reason: short is greater than byte
		
		
		int intNumber = -19876;
		long longNumber2 = intNumber;  //  correct: long is greater than int
		System.out.println(longNumber2);
		
		short shortNumber3 = -30000;
		short shortNumber4 =  shortNumber3;
		System.out.println(shortNumber4);
		
	//	int exampleNum1 = 10.5;
		float exampleNum2 =  10.5F;  // assign lower or upper f  F
		float exampleNum3 =  20.5f;
		
		double doubleNumber = 10.5;
		double doubleNumber2 = 30.5;
		
	//	float floatNumber = doubleNumber2; // error: double > float
		
		System.out.println("=======================");
	
		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("=======================");
		
		float fNum = bNum;
		float fNum2 = sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		
		double dNum = bNum;
		double dNum2 = sNum;
		double dNum3 = iNum;
		double dNum4 = lNum;
		
		System.out.println("=======================");
		
		System.out.println(dNum);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
		
				
		
		
		
		
		
	}
	
}
