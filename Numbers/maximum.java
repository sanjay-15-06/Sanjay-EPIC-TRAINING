package Task_1;

import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int max = (a>b ? a:b) > c ? (a>b ? a:b) : c ;
		max = max > d ? max : d ;
		
		System.out.println("Maximum" + max);
		sc.close();
		

	}

}
