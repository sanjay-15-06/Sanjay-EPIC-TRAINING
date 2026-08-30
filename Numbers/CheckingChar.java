package Numbers;

import java.util.Scanner;

public class CheckingChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch >= '0' && ch <= '9') {
			System.out.println("number");
		}
		else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<='z' )){
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special character");
		}
		sc.close();
	}

}
