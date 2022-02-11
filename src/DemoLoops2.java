
public class DemoLoops2 {
  		
	public static void main(String[] args) {
		System.out.println("Printing by for Loop");
		
		int count = 1;
		for (count=1; count<=10; count = count +2 ) {
			System.out.println(count);
		}
		
		System.out.println("\n Printing by for While Loop:\n");
		
		int num =1;
		
		while (num <= 5) {
			System.out.println(num);
			num++;
		}
		System.out.println("\n Printing by for do-while loop");
				
				int attemptsRemain = 10;
		do {
			System.out.println("Attempts remianing: " + attemptsRemain);
			attemptsRemain ++;
		}while (attemptsRemain <=10); 
			
	}
}