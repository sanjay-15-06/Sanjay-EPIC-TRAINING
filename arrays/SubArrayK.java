package arrays;

public class SubArrayK {

	public static void main(String[] args) {
		int [] arr = {2,1,2,1,2,3};
		int k = 3;
		for(int i =0;i<=arr.length - k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(arr[j]+" ");
			}
		System.out.println();
		}

	}

}
