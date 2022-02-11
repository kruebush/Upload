
public class Demo2 {
	
	public void testScores() {
		int grade = 78;
		
		if (grade > 60) {
			System.out.println("Congrats, you cleared the Test!" + "\n Your score is: " + grade );
		}else { 
			System.out.println("Sorry you did not pass.");
		}
			
	}
		
	public static void main (String [] args) {
		Demo2 d= new Demo2();
		d.testScores();
}
}
