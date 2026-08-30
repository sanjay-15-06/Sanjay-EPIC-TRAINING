package leetcode;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] arr = {0,0,1,1,1,2,2,3,3,4};
		int count =0;
		for(int i =0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					count++;
					
					System.out.print(arr[i]+ " " + count);
				}
			}
			
		}

	}

}
