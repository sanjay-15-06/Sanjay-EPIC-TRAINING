package numbers;

import java.util.Scanner;

class strong_num {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {

            int rem = num % 10;

            int fact = 1;

            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if (sum == temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    sc.close();
    }
}