package twoDarray;

import java.util.Scanner;

public class Printnig2D {

	public static void main(String[] args) {
		//int [][] arr = new int [3][3]; way to declare a 2d array with size
//		int [][] arr= {
//				{1,2,3},
//				{3,4,5},
//				{6,7,8}
//		};
		Scanner in = new Scanner(System.in);
		System.out.println("enter element: ");
		int n = in.nextInt();
		System.out.println("enter element: ");
		int m = in.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
