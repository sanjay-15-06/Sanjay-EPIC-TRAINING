package arrays;

public class Duplicates {

	public static void main(String[] args) {
		int []arr = {2,2,4,5,4,0};
		int count = 0;
		for (int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count+=1;
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

}
