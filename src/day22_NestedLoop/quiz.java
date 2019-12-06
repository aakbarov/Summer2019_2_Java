package day22_NestedLoop;
import java.util.*;
public class quiz {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter your first number");
//		int n1 = input.nextInt();
//		System.out.println("Enter your second number");
//		int n2 = input.nextInt();
//		System.out.println("Enter your third number");
//		int n3 = input.nextInt();
//		int max = (n1>n2 && n1>n3)?n1:(n2>n1 && n2>n3) ? n2: n3;
//		System.out.println("The maximum number is "+max);
		
//		String str = "Azerbaijan";
//		System.out.println(str.charAt(6));
//		System.out.println(str.length());
//		
//		System.out.println("===============");
//		str=str.concat("/Baku\n");
//		System.out.println(str.concat(str));
//		
//		char ch = str.charAt(6);
//		System.out.println(ch);
//		
//		System.out.println("===============");
//		
//		String N = "akbarov";
//		N = N.toUpperCase();
//		System.out.println(N);
//		
//		System.out.println("===============");
//		
//		String Z = "UNITED STATES OF AMERICA";
//		Z = Z.toLowerCase();
//		System.out.println(Z);
//		
//		String b = "Cybertek";
//		
//		String c = b.concat(" Batch12 Javengers");
//		
//		System.out.println(c);
//	    b =  b.concat(" Batch12 Javengers");
//		System.out.println(b);
		
//		String f = "afgan";
//		System.out.println(f);
//		System.out.println(f.toUpperCase());
//		System.out.println(f.length());
//		System.out.println(f.charAt(4));
//		System.out.println(f.codePointAt(3));
//		System.out.println(f.toCharArray());
//		System.out.println(f.toUpperCase());
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your phone number");
//		String phoneNumber = scan.next();
		
		String LongName = "Cybertek School";
	    System.out.println(LongName.indexOf("S"));
		
//		String LongName2 = LongName.substring(9);
//		System.out.println(LongName2);
//		                   01234
//		System.out.println(LongName.length());
//	    System.out.println(LongName.toLowerCase());
//		System.out.println(LongName.indexOf(LongName));
//		System.out.println(LongName.trim());
//		System.out.println(LongName.substring(9));
//		LongName = LongName.substring(9);
//		System.out.println(LongName);
//		String Longname2 = LongName.substring(10);
		
//		System.out.println(LongName.substring(2, 13));
//		
//		System.out.println(LongName.replace('e', '9'));
//		
//		String str= "Today I'm going to study Java Java";
//		System.out.println(str.replace('o', '0'));
//		System.out.println(str.replace("Today", "Tomorrow"));
//		System.out.println(str.replaceFirst("Java", "Java"));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
//		
		String firstName = scan.nextLine();
		firstName = firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
		System.out.println(firstName); 
		
	}

}
