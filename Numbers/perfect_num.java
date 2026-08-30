package numbers;

import java.util.Scanner;

class perfect_num {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0)
                sum = sum + i;
        }

        if (sum == num) {
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not Perfect Number");
        }
    sc.close();
    }
}
