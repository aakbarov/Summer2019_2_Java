package repl_It;

import java.util.Scanner;

public class Repl_057_Find_A_User {
	/*
	 * Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user
	 * to enter full name. Display message: "Enter full name:". Then take input from
	 * user. If name is equals to either "Max Payne" or "Alan Wake", display
	 * message: "User found!". Otherwise, display message: "User not found!". Please
	 * make your search case insensitive!
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String name = scan.nextLine();

		if (name.equalsIgnoreCase("Max Payne") || name.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User found!");
		} else {
			System.out.println("User not found!");
		}

	}

}
