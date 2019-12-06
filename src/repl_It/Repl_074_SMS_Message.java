package repl_It;

import java.util.Scanner;

public class Repl_074_SMS_Message {
	/*
	 * We have a message variable already declared and assigned value in this format
	 * 
	 * Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing
	 * and problem solving}
	 * 
	 * Variables are already declared:
	 * 
	 * sender, phoneNumber, messageBody - by using String methods: retrieve related
	 * information from SMSmessage string and assign to those 3 variables. -print
	 * each variable in separate line
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("input here:");
		String message = scan.nextLine();
		String sender;
		String phoneNumber;
		String messageBody;

		System.out.println("Sender: " + message.substring(message.indexOf("<") + 1, message.indexOf(">")));
		System.out.println("Phone Number: " + message.substring(message.indexOf("[") + 1, message.indexOf("]")));
		System.out.println("Message body: " + message.substring(message.indexOf("{") + 1, message.indexOf("}")));

	}

}
