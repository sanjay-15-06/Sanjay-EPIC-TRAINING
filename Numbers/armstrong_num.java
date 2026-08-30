package java_tasks;

import java.util.Scanner;

class armstrong_num {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    sc.close();
    }
   
}
