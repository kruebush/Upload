package home_practice;

import java.util.Scanner;

public class AppPractice {

	
	/////1. print hello and your name on seperate line
	
	public static void main(String[] args) {
		System.out.println("Hello\n" + "Kami");
		
	//////2. write program to print the sum of 2 numbers
		
	/*	
	 	int num1 = (74);
		int num2 = (36);
		int sum = (num1 + num2);
		System.out.println("Test Data:\n" + num1 + "+" + num2);
		System.out.println("Expected Output: \n" + sum);
		
	//////3. divide 2 num and print
		
		int num11 = (50);
		int num22 = (3);
		int div = (num11/num22);
		System.out.println("Test Data:\n" + num11 + "/" + num22);
		System.out.println("Expected Output: \n" + div);
		
	/////4. Write program to print following operation:
		System.out.println("Expeted Output: ");
		System.out.println(-5 + (8 * 6));
		System.out.println((55+9) % 9);
		System.out.println(20+(-3*5)/8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
	/////5. write program that takes two numbers as input and display the product of two numbers.
			Scanner sc = new Scanner (System.in);
			System.out.println("Input first number: ");
			int number1 = sc.nextInt();
			System.out.println("Input second number: ");
			int number2 = sc.nextInt();
			System.out.println("product of " + number1 +" x " + number2 + " = \n" + number1 * number2);
			
	/////6. Write program to print the sum, multiply, subtract, divide and remainder of two numbers
			Scanner sc2 = new Scanner (System.in);
			System.out.println("Input first number: ");
			int numb1 = sc2.nextInt();
			System.out.println("Input second number: ");
			int numb2 = sc.nextInt();
			System.out.println("Summnation of: " + numb1 +" + " + numb2 + " = " + numb1 + numb2+ "\n");
			System.out.println("product of: " + numb1 +" x " + numb2 + " = " + numb1 * numb2+ "\n");
			System.out.println("Difference of: " + numb1 +" - " + numb2 + " = " + (numb1 - numb2) + "\n");
			System.out.println("Divisible of: " + numb1 +" / " + numb2 + " = " + numb1 / numb2+ "\n");
			System.out.println("Mod of: " + numb1 +" % " + numb2 + " = " + numb1 % numb2 + "\n");
	
	
	
	/////7. write a program that takes a number as input and prints its multiplication table up to 10.
			Scanner sc = new Scanner(System.in);
			System.out.println("Test Data:");
			System.out.println("To get a multiplication table of a number. \nInput a number: ");
			int num1 = sc.nextInt();
			System.out.println("Multiplication Chart for "+ num1);

			for (int i=0; i< 10; ++i ) {
				System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i+1)) );
			}
	
			
					
	/////8. Write program to display the following pattern.
		System.out.println("Sample Pattern: ");
			
		System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
			
	
		
	/////12. write program that takes input of 3 numbers as input to calculate and calculate the average.
		Scanner sc= new Scanner (System.in);
		System.out.println("Please provide 3 numbers so we can find the average: ");
		System.out.println("Input value 1: ");
		int inp1 = sc.nextInt();
		System.out.println("Input value 2: ");
		int inp2 = sc.nextInt();
		System.out.println("Input value 3: ");
		int inp3 = sc.nextInt();
		int average = ((inp1 + inp2 + inp3)/3);
		System.out.println("Average is: " + average);
	
		
		
	/////15. Write program to swap variables:
		//Using temp variable
		int a, b, temp;
		a = 15;
		b = 27;
		System.out.println("Before swapping : " + a + " , " + b  );
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : " + a + " , " + b  );
	
		
		//not using temp variable; int, double, float
		int a, b;
		a = 15;
		b = 27;
		System.out.println("Before swapping : " + a + " , " + b  );
		a = a + b; System.out.println(a);
		b = a - b;System.out.println(b);
		a = a - b;System.out.println(a);
		System.out.println("After swapping : " + a + " , " + b  );
	
	*/
	
	/////(17 - 30) . BINARY NUMBERS SKIPPED COME BACK TOO!!!!!!!!!!!!!!!!!! 
	
		
	/*	
	/////31 write a Java program to check whether java is instaleld on your computer
		  System.out.println("\nJava Version: "+System.getProperty("java.version"));
		    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		    System.out.println("Java Home: "+System.getProperty("java.home"));
		    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
		
	}
	*/	
	/////32. write  a java program to compare two numbers.
		
		System.out.println("Input Data: ");
		System.out.println("Input first Integar: ");
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		num1 = sc.nextInt();
		System.out.println("Input second Intergar: ");
		num2 = sc.nextInt();
		
		System.out.println("Expected Output: ");
		if (num1 <= num2) 	
			System.out.println("First Integer is not equal to second integar\n"+ num1 +"!=" +num2);
		if (num1== num2)
			System.out.println("The integers you have chosen are equal");
		if ( num1<num2)
			System.out.println("Integer one is less than integer two!\n"+ num1 + "<" + num2);
		if ( num1 > num2)
			System.out.println("Integer one is greater then integer two!");
	
	
	}
	
}





