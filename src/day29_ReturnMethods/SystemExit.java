package day29_ReturnMethods;

public class SystemExit {

	public static void main(String[] args) {

		// System.out.println( number() );

		method1();
		System.out.println("Done");
		System.out.println("Completed");
	}

	public static void method1() {
		System.out.println("Hello World");
		// System.exit(0);
	}

	public static int number() {

		if (8 < 9) {
			System.exit(0); // exits all the java execution
		}

		return 5;
	}
}
