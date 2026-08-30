package arrays;

public class AllElementsEqual {
	
	public  boolean main() {
		int [] arr = {1,1,2,3};
		int n = arr[0];
		for(int i=0;i<arr.length;) {
			if(arr[i]==n) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
	}

}
