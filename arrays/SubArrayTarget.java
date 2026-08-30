package arrays;

import java.util.Scanner;

public class SubArrayTarget {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		int k = 3;
//		System.out.println("Enter SubArray value : ");
//		int k = in.nextInt();
		
//		System.out.println("Enter Array size value : ");
//		int s =in.nextInt();
//		int [] arr = new int[s];
		
		int [] arr = {1,2,1,1,2,1,3,1};
//		System.out.println("Enter Array value : ");
//		for(int i =0;i<s;i++) {
//			arr[i] =in.nextInt(); 
//		}
		
		int target = 4;
//		System.out.println("Enter target value : ");
//		int target = in.nextInt();
		
		
		for(int i =0;i<=arr.length - k;i++) {
			int sum =0;
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
				if(sum==target) {
					for(int l=i;l<=j;l++) {
//						System.out.println("Sub3Array ");
						System.out.print(arr[l]+" ");
					}
					System.out.println();	
			}
			
		
		}

	}
	}

}
