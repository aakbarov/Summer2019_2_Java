package day08_ShortHandOperators;

public class Warmup {

	/*
	 Task2: write a java program that converts gallons to litters
	 				1 gallon = 3.785 litters
	 				1 litter = 1/3.785 
	 		write a java program that converts litters to gallons

	 				 
	 */
	
	public static void main(String[] args) {
		
		int gallon = 16;
		double litters = gallon * 3.785;  //  converts gallon to litters
		String result1 = gallon + " gallons  equal to " + litters + " litters" ;
		
		System.out.println( result1 );
		
		double L = 10;
		double G = L/3.785;
		String result2 = L + " litters equal to " + G + " gallons" ;
		
		System.out.println(result2);
		
		//Task 1:
		int x = 2;
		int y = x++; // y = 2; x = 3
		System.out.println(y+ " " +x);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
