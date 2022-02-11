package day_two;

import java.util.Date;
import java.util.Scanner;

//////// create a function and call it  
//public class DemoDay2 {

	//public void printWelcomeMessage() {
		//System.out.println("Hi, this is day 2 get ready for training");
	//}
	
	//public static void main(String[] args) {
		//System.out.println("Hello and welcome to day 2 training");
		//DemoDay2 d = new DemoDay2 ();
		//d.printWelcomeMessage();
		//d.printWelcomeMessage();
		//d.printWelcomeMessage();

//	}

//}

////// create a function add parameters with instruction! Method with parameters

/*public class DemoDay2 {

	public void printWelcomeMessage() {
		System.out.println("Hi, this is day 2 get ready for training");
	}
	public void addNumber (int number1, int number2) {
		System.out.println(number1 + number2);
	}
	public static void main(String[] args) {
		System.out.println("Hello and welcome to day 2 training");
		DemoDay2 d = new DemoDay2 ();
		d.printWelcomeMessage();
		d.addNumber(7, 7);
		d.addNumber(3, 9);
		d.addNumber(44, 99);

	}

}*/

///////// return type change change void to int, add retrun, and then add int result(must do with return)
//////// int result = will give us a value for the return value. if we want all the values of num1 and nnum2 used we do result +
////////

/*class DemoDay2 {

	public void printWelcomeMessage() {
		System.out.println("Hi, this is day 2 get ready for training");
	}
	public int addNumber (int number1, int number2) {
		System.out.println(number1 + number2);
		return number1 + number2;
	}
	public static void main(String[] args) {
		System.out.println("Hello and welcome to day 2 training");
		DemoDay2 d = new DemoDay2 ();
		d.printWelcomeMessage();
		int result= d.addNumber(7, 7);
		result += d.addNumber(3, 9);
		result += d.addNumber(44, 99);
		
		System.out.println(result);
	}
}*/



/////////Var Args and enhanced for loops.
/////////Var Args are good for when you dont know how many values will be given

class DemoDay2 {

	public void printWelcomeMessage() {
		System.out.println("Hi, this is day 2 get ready for training");
	}
	//varargs...
	public int addNumber (int...num) {
//enhanced for loop
		int sum=0;
		for(int i:num) {
				sum = sum +i;
		}
		return sum;
}
public void printProductNames(String...productName) {
		
		for(String p:productName) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		DemoDay2 d = new DemoDay2();
		int result = d.addNumber(7,7,2);
		System.out.println(result);
		d.printProductNames("Watch","Pendrive","Adaptor");
		System.out.println("=====================");
		
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your name: ");
		String age = sc.next();
	
	System.out.println("You name is " + age);
	Date date = new Date();
	System.out.println(date);
	}	
}
 



