package leetcode;

import java.util.Scanner;

public class MajorityElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements (space-separated):");
        String input = sc.nextLine();

        String[] values = input.split(" ");
        int[] nums = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            nums[i] = Integer.parseInt(values[i]);
        }

        // Your logic
        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count >= 2) {
                System.out.println(nums[i]);
            }
        }

        sc.close();
    }
}
