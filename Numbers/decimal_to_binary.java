package numbers;

import java.util.Scanner;

class decimal_to_binary {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(Integer.toBinaryString(num));
    sc.close();
    }
}