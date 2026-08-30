package Task_1;

import java.util.Scanner;

class check_alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		char ch = sc.next().charAt(0);
		if((ch>='a'&& ch<='z')||(ch >'A'&& ch <'Z')) {
			System.out.println("Alphabet");
		}else {
			System.out.println("Not an Alpphabet");
		}
		sc.close();

	}

}
