package repl_It;

import java.util.Scanner;

public class Repl_044_Blackjack_keep_Hand {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int house = s.nextInt();
		int player = s.nextInt();
		
		if ((player > 21 && house > 21) || player > 21 && house < 21) {
		      System.out.println("bust");
		      
		    }
		    if (house > player) {
		       System.out.println("player loss");
		    }
		    if (house == player) {
		      System.out.println("its a tie");
		    }
		    if (player > house ) {
		      System.out.println("player wins");
		    }
	}

}
