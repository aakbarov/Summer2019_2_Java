package repl_It;

import java.util.Scanner;

public class Repl_080_Online_Book_Merchants {
	/*
	 * Online Book Merchants offers premium customers 1 free book with every
	 * purchase of 5 or more books and offers 2 free books with every purchase of 8
	 * or more books. It offers regular customers 1 free book with every purchase of
	 * 7 or more books, and offers 2 free books with every purchase of 12 or more
	 * books. Write a program that assigns freeBooks the appropriate value based on
	 * the values of the boolean variable isPremiumCustomer and the int variable
	 * nbooksPurchased. Print amount of freeBooks into the console.
	 */
	public static void main(String[] args) {

		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println();
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer) {
			if (nbooksPurchased <= 4) {
				freeBooks = 0;
				System.out.println(freeBooks);
			}
			if (nbooksPurchased >= 5 && nbooksPurchased <= 7) {
				freeBooks = 1;
				System.out.println(freeBooks);
			} else if (nbooksPurchased >= 8) {
				freeBooks = 0;
				for (int i = 8; i <= nbooksPurchased; i += 8) {
					freeBooks += 2;

				}
				System.out.println(freeBooks);
			} else {
				System.out.println("worng input");
			}
		}

		else if (isPremiumCustomer != true) {
			if (nbooksPurchased <= 6) {
				freeBooks = 0;
				System.out.println(freeBooks);
			}
			if (nbooksPurchased >= 7 && nbooksPurchased <= 11) {
				freeBooks = 1;
				System.out.println(freeBooks);
			} else if (nbooksPurchased >= 12) {
				freeBooks = 0;
				for (int i = 12; i <= nbooksPurchased; i += 12) {
					freeBooks += 2;

				}
				System.out.println(freeBooks);
			}
		} else {
			System.out.println("Wrong imput");
		}

	}

}
