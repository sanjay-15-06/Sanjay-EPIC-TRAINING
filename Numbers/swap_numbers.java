package Task_1;

import java.util.Scanner;

public class swap_numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a = ");
		int a = scan.nextInt();
		System.out.println("b = ");
		int b = scan.nextInt();
		int temp = a ;
		a=b;
		b=temp;
		System.out.println("a = " +a);
		System.out.println("b = "+b);
		scan.close();
		
	}

}
