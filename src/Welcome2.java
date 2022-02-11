
public class Welcome2 {

	public void display() {
		System.out.println("##Welcome to revature!");
		Welcome2 w = new Welcome2();
		w.login();
		Logo l = new Logo();
	
	}
	
	public void login() {
		System.out.println("Loging Required: ");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Welcome2 w= new Welcome2();
		w.display();
		Logo l= new Logo();
		l.printLogo();
		

	}
}

class Logo {
	
	public void printLogo() {
		System.out.println("Logo print logo called");
	}
	

	public static void amin (String[]args) {
		System.out.println("MAIN METHOD OF LOGO CALLED");
	}
}