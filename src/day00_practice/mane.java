package day00_practice;

import java.util.Scanner;

public class mane {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE:
   int num1, num2, num3, sum;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 3 numbers:");
    num1=scan.nextInt();
    num2=scan.nextInt();
    num3=scan.nextInt();
    
    System.out.println("Sum of numbers: "+(num1+num2+num3));
}
}
