package Task_1;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input : ");
		int a =scan.nextInt();
		if(a>0) {
			System.out.println("Positive");
		}else if(a<0){
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
		scan.close();
	}

}
