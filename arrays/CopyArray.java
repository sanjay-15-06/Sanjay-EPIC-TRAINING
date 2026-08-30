package arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int []arr = {1,2,3};
		int [] arr1 = {};
		Arrays.copyOf(arr,arr1);
		
		System.out.println(arr1[]);

	}

}
