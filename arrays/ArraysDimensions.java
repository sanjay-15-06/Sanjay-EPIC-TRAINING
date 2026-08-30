package arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class ArraysDimensions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//matrix 1
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns");
		int columns = sc.nextInt();
		int arr [][] = new int [rows][columns];
		
	
		
		
		//input for matrix 1
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				arr[i][j] = sc.nextInt();				
			}
		}
		
		
		//matrix 2
		System.out.println("Enter no of rows");
		int row_1 = sc.nextInt();
		System.out.println("Enter no of columns");
		int column_1 = sc.nextInt();
		int arr2[][] = new int [row_1][column_1];
		
		
		
		//input for matrix 2
		for(int i = 0;i<row_1;i++) {
			for(int j = 0;j<column_1;j++) {
				arr2[i][j] = sc.nextInt();				
			}
		}
		
		//printing matrix 1
		System.out.println();
		System.out.println("Matrix : ");
		for (int i = 0; i<rows;i++) {
			for (int j = 0;j<columns;j++) {
//				System.out.print(Arrays.deepToString(arr));
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println( );
			
		}
		
		
		//printing matrix 2
				System.out.println();
				System.out.println("Matrix : ");
				for (int i = 0; i<rows;i++) {
					for (int j = 0;j<columns;j++) {
//						System.out.print(Arrays.deepToString(arr));
						System.out.print(arr2[i][j]+ " ");
					}
					System.out.println( );
					
				}
				
				
		//adding two matrix
		int sum [][]= new int [rows][columns];
		for (int i=0;i<rows;i++) {
			for(int j = 0; j<columns;j++) {
				 sum[i][j] = arr[i][j]+arr2[i][j];
			}
		}
		
		
		
		
				
		//printing addition matrix 
				System.out.println();
				System.out.println("Matrix : ");
				for (int i = 0; i<rows;i++) {
					for (int j = 0;j<columns;j++) {
//						System.out.print(Arrays.deepToString(sum));
						System.out.print(sum[i][j]+ " ");
					}
					System.out.println( );
				}
				
				//printing multiplication matrix 
				System.out.println();
				System.out.println("Matrix : ");
				for (int i = 0; i<rows;i++) {
					for (int j = 0;j<columns;j++) {
//						System.out.print(Arrays.deepToString(sum));
						System.out.print(sum[i][j]+ " ");
					}
					System.out.println( );
				}
		
				
	}

}
