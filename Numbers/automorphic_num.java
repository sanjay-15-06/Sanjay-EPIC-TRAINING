package java_tasks;

import java.util.Scanner;

class automorphic_num {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int square = num * num;

        if (square % 100 == num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    sc.close();
    }
}
