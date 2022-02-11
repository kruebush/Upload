package home_practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter yoru age: ");
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("What is your favorite food?\nType your answer here: ");
			String food = sc.next();
			
			
			if (food.equals("pizza")) {
				System.out.println("Pizza is my favorite too!");
			}
			else {
				System.out.println ("not my fav but great choice!");
			}
		}
		else if (age>=13) {
			System.out.println("You are a teenager.");
		}
		else {
			System.out.println("You are not a teenager or an adult");
			
	}
	
	
	
	
	
	
	
	
	}
}
