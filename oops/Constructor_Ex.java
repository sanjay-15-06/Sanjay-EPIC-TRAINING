package consoleBasedApp;

import java.util.Scanner;

public class Constructor_Ex {

	int a,b;
	
	public Constructor_Ex() {
		System.out.println("Default Constructor");
	}
	
	public Constructor_Ex(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public void display() {
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Constructor_Ex obj = new Constructor_Ex();
		Constructor_Ex obj1 = new Constructor_Ex();
		Constructor_Ex obj2 = new Constructor_Ex();
		
		obj.display();
		obj1.display();
		obj2.display();
		
		
		for(int i=0;i<2;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			Constructor_Ex a1 = new Constructor_Ex(a,b);
			a1.display();
		
		}
		
		//a1.display();
		
	}

}
