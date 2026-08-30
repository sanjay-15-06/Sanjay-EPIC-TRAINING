package arrays;


public class PrintDuplicates {

	public static void main(String[] args) {
		int [] arr = {1,2,3,3,2,1,5};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]==arr[j]&&j>i) {
						System.out.print(arr[i]+ " ");
					}else if(j<i && arr[i]==arr[j]) {
						break;
					}
				}
			}

		}

	}

}
