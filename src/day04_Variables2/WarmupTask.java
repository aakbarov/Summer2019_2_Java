package day04_Variables2;

public class WarmupTask {
	
	/*
	 1. Cucumber        => $2.5         => float, double
	 2. Onion           => $1.5         => float, double
	 3. Green Pepper    => $2           => byte, short, int, long, float, double
	 4. Tomatoes        => $3           => byte, short, int, long, float, double
	 5. Carrot          => $4           => byte, short, int, long, float, double
	 
	 */
	
	
		public static void main(String[] args) {
			// Cucumber:
		//	int Cucumber = 2.5; we can only assign whole numbers to int
			
		//	float Cucumber = 2.5;   //  float cannot contain double
			float Cucumber = 2.5f;
			double Cucumber2 = 2.5f;   // double can contain float
			double Cucumber3 = 2.5;
			
		//  onion:  1.5
			float Onion = 1.5f;
			double Onion2 = 1.5f;
			double Onion3 = 1.5;
			
			
		//  Green Pepper: 2
			byte GreenPepper = 2;
			short GreenPepper2 = 2;
			int GreenPepper3 = 2;
			long GreenPepper4 = 2;
			float GreenPepper5 = 2;  // only time we add f or F is, when are assigning decimals
			double GreenPepper6 = 2;  // special characters that we can add after the number 2 are "l" and "f"
			
			System.out.println(GreenPepper);
			System.out.println(GreenPepper2);
			System.out.println(GreenPepper3);
			System.out.println(GreenPepper4);
			System.out.println(GreenPepper5);  //  float and double converts the whole numbers to decimals
			System.out.println(GreenPepper6);
			
			System.out.println("============");
			
		//	Tomatoes: 3
			byte Tomatoes = 3;
			short Tomatoes2 = 3;
			int Tomatoes3 = 3;
			long Tomatoes4 = 3;
			float Tomatoes5 = 3;  // only time we add f or F is, when are assigning decimals
			double Tomatoes6 = 3;
			
			System.out.println(Tomatoes);
			System.out.println(Tomatoes2);
			System.out.println(Tomatoes3);
			System.out.println(Tomatoes4);
			System.out.println(Tomatoes5);
			System.out.println(Tomatoes6);
			
			System.out.println("============");
			
			
		//	Carrot: 4
			byte Carrot = 4;
			short Carrot2 = 4;
			int Carrot3 = 4;
			long Carrot4 = 4;
			float Carrot5 = 4;  // only time we add f or F is, when are assigning decimals
			double Carrot6 = 4;
			
			System.out.println(Carrot);
			System.out.println(Carrot2);
			System.out.println(Carrot3);
			System.out.println(Carrot4);
			System.out.println(Carrot5);
			System.out.println(Carrot6);
			
			
			
		
	}

}
