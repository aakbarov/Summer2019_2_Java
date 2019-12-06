package day03_Variables;

public class EscapeSequences {
	/*
	  \n (or \r): starts from new line
	  \t: horizontal tab
	  \\: prints a back slash
	  \': prints single quote 
	  \": prints double quote
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello Cybertek \nBatch 12 students");
		
		System.out.print("Tomorrow is off\n");
		System.out.print("True\r");
		System.out.print("False\n\r\n");
		
		System.out.println("\t Class starts tomorrow");
		
		System.out.println("\\muhtar");
		System.out.println("\'Java");
		
		System.out.println("Book is called \"Game of Throne\"");
	}
}
