package Numbers;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n%400==0) {
			System.out.println(" Century leap year");
		}else if (n % 4==0) {
			System.out.println("Leap year");
			
		}
		else {
			System.out.println("Not a leap year");
		}
		sc.close();

	}

}
