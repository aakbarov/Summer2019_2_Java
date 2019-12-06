package repl_It;

public class Repl_081_Evens {

	// Write a program that will print out even numbers from 2 to 100 through the
	// comma.

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)

				System.out.print(i + ", ");
		}
	}

}
