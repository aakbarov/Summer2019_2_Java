package day04_Variables2;

public class PrimitiveDataTypes2 {
	
	/*
	 Primitives: byte, short, int, long, float, double, boolean, char
	 
	 	boolean: takes either true or false expressions 
	 	
	 	char: declared with in the single quote ' '; single character only,   Each character has its own corresponding number (ASCII)
	 			'' is a Must when you give a character as value
	 	
	 
	 */
	public static void main(String[] args) {
		
    //	boolean result4 = Earth is Flat;
	//	boolean num1 = 100;  boolean only takes true or false results
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 =  9 > 3;
	
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
		// char:
		
		char char1 = 'a';
		
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n");
		
		// char with numbers
		char char4 = 67;  //  only time we use  ' ' for char is when we are declaring single character
		System.out.println(char4);
		
		char char5 = 'C';
		System.out.println(char5);
		
		char char6 = '{';
		char char7 = 123;
		System.out.println(char6);
		System.out.println(char7);
		
		
		// initializing char to other primitives: byte, short, int, long, float, double
		char MyChar1 = 'b';
		System.out.println(MyChar1);
		
		
		int MyInt = MyChar1;  // the number that represents b is initialized to the int
		
		System.out.println(MyInt);   // 98
		
		
	//	byte MyByte = MyChar1  // gives error , because veriable represents char(2 byte), which is larger than byte(1byte)
		byte MyByte2 = 'b';    //  no error, because b's corresponding number is 98
		System.out.println(MyByte2);
		
	//	short ShortNum = MyChar1; // gives error because char' memory could be larger
		short ShortNum2 = 'b';   // b's corresponding number is 98 from ASCII table
		System.out.println(ShortNum2);
		
		long longNum = MyChar1;   // long's memory is 8 bytes
		long longNum2 = 'b';   // 98
		System.out.println(longNum);
		
		float floatNum = MyChar1;
		float floatNum2 = 'b';
		System.out.println( floatNum2 );
		
		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println( doubleNum2 );
		
		char myCharValue = 555;
		System.out.println(myCharValue);
		
		
		
		
		
		
		
		
	}

}
