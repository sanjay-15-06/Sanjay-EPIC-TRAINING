package leetcode;


public class ArraySum1 {

	public static void main(String[] args) {
		int [] digits= {1,2,9};
		for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }
		if (digits[0] == 0) {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
	        }
		} else {
			for(int i =0;i<digits.length;i++) {
				System.out.print(digits[i]+" ");
			}
		}
	}
}

