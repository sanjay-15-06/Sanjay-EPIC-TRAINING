package Problems;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		int n = 10;
		int[] odd = new int[n-(n/2)];
		int[] even = new int[n/2];
		int m = 0;
		int l=0;
		
		for(int i =1;i<=n;i++) {
			if(i%2==0) {
				even[m++]=i;
			}
			else {
				odd[l++]=i;
			}
		}
		System.out.println("odd : "+ Arrays.toString(odd));
		System.out.println("even : " + Arrays.toString(even));
	}

}
