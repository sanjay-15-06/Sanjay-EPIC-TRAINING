package Problems;

public class PrintingSubArray {

	public static void main(String[] args) {
//		int []arr = {5,-1,1,2,1,-1,5,2,-3};
		int []arr = {1,2,3};
//		int target = 4;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
//					if(arr[j]+arr[k]==target||arr[j]-arr[k]==target) {
//						System.out.print(arr[j]+ " "+ arr[k]);
//					}
					System.out.print(arr[k]+" ");
				}
			System.out.println();
			}
			
		}
		
		
	}
}
