package java_tasks;

import java.util.Scanner;

class lcm {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = (a > b) ? a : b;

        while (true) {

            if (max % a == 0 && max % b == 0) {
                System.out.println(max);
                break;
            }

            max++;
        sc.close();
        }
    }
}