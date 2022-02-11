package day_two;

import java.util.Scanner;

public class DemoArrayDay2 {

	////// [] indicates an Array
	public static void main(String[] args) {
		int grade[] = {87,68,59,95,69,36,56};
		
		
		//reg for loop w/ arrays
		System.out.println("Printing all the grades: ");
		for (int i= 0; i< grade.length; i++) {
			System.out.println(grade[i]);
		}

	/////// Enhanced for loop w/ arrays

		System.out.println("Printing all the grades using enhanced for loop : ");
		for(int i:grade) {
			System.out.println(i);
		}
		
	//////////Use Case : Accept five numbers from user and print sum
		
		int num [] = new int [5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("please enter five numbers:  ");
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum+= num[i];
		}
		System.out.println("Print the sum of the numbers youve enetered is: " + sum);
	}
}