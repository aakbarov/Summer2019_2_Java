package repl_It;

import java.util.Scanner;

public class Repl_076_Build_A_Route {
	/*
	 * Write a program that will print out route instructions. Your program should
	 * take 2 parameters: start point and end point. Use left, right, up and down
	 * for navigation. Insert ">" between commands. If start point equals to end
	 * point - display: "start/end(start or end variable!) found". Note: you may
	 * move only clock wise.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		String start = scan.next();
		String end = scan.next();

		if (start.equals("A") && end.equals("A")) {
			System.out.println(end + " found");
		}
		if (start.equals("A") && end.equals("B")) {
			System.out.println("right: " + end + " found");
		}
		if (start.equals("A") && end.equals("C")) {
			System.out.println("right > down: " + end + " found");
		}
		if (start.equals("A") && end.equals("D")) {
			System.out.println("right > down > left: " + end + " found");
		}
		if (start.equals("B") && end.equals("B")) {
			System.out.println(end + " found");
		}
		if (start.equals("B") && end.equals("C")) {
			System.out.println("down: " + end + " found");
		}
		if (start.equals("B") && end.equals("D")) {
			System.out.println("down > left: " + end + " found");
		}
		if (start.equals("B") && end.equals("A")) {
			System.out.println("down > left > up: " + end + " found");
		}
		if (start.equals("C") && end.equals("C")) {
			System.out.println(end + " found");
		}
		if (start.equals("C") && end.equals("D")) {
			System.out.println("left: " + end + " found");
		}
		if (start.equals("C") && end.equals("A")) {
			System.out.println("left > up: " + end + " found");
		}
		if (start.equals("C") && end.equals("B")) {
			System.out.println("left > up > right: " + end + " found");
		}
		if (start.equals("D") && end.equals("D")) {
			System.out.println(end + " found");
		}
		if (start.equals("D") && end.equals("A")) {
			System.out.println("up: " + end + " found");
		}
		if (start.equals("D") && end.equals("B")) {
			System.out.println("up > right: " + end + " found");
		}
		if (start.equals("D") && end.equals("C")) {
			System.out.println("up > right > down: " + end + " found");

		}
	}
}