package day00_practice;

public class nestedIfStatement {
	
	public static void main(String[] args) {
		
		int typeSelection = 2;
		int drinkSelection = 1;
		double price;
		String drink;
		
		if (typeSelection==1) {
			System.out.println("Hot drink: 1-Tea, 2-Coffee");
			if(drinkSelection==1) {
				price=2.0;
				drink="Tea";
			}else if(drinkSelection==2) {
				price=4.0;
				drink="Coffee";
			}else {
				System.out.println("Invalid hot drink Selection");
			}
		}else if(typeSelection==2) {
			System.out.println("Cold drink: 1-Iced Tea, 2-Lemonade");
			if(drinkSelection==2) {
				price=3.3;
				drink="Iced Tea";
			}else if(drinkSelection==2) {
				price=4.2;
				drink="Lemonade";
			}else {
				System.out.println("Invalid cold drink Selection");
			}
		}else {
			System.out.println("Invalid Drink Type Selection");
		}
		

		
		
	}

}