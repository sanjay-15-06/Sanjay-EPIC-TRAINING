package arrays;

public class ReverseArray {
	class Rev{
		int [] arr = {1,2,3,4,5};
		
	}
	

	public static void main(int[] arr) {
		int l =0;
		int r =arr.length - 1; 
		while(arr[l]<arr[r]) {
			int temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		System.out.println();
	}

}
