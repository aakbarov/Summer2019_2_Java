package day00_practice;

import java.util.*;
public class positiveNegative {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

    //your code here
    
    if (num>0) {
    	System.out.println("positive");
    }if (num<0) {
    	System.out.println("negative");
    }if (num==0) {
    	System.out.println("zero");
    }
    
   

    
  }
}

