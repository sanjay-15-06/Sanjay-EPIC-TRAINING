package Problems;

import java.util.*;



public class FindingCombinations {



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i= 0;i<n;i++){
		    arr[i] = in.nextInt();
		}
		int target = in.nextInt();
		int prev = 0,next = 0;
		while(prev<n){
		    int sum = 0;
		    for(int i=prev;i<=next;i++){
		        sum+=arr[i];
		    }
		    if(sum>=target){
		        prev++;
		        next=prev;
		        continue;
		    }
		    for(int j=next+1;j<n;j++) {
		    	if(sum+arr[j]==target) {
		    		for(int k=prev;k<next;k++) {
		    			System.out.print(arr[k] + " ");
		    		}
		    		System.out.print(arr[j] + " ");
		    	}
		    System.out.println();
		    }		   
		    next++;
		}
	}
}
			
		
//		int [] arr = {5,5,10,10,20,30,40,50};
//		
//		for(int i =0;i<arr.length;i++) {
//			if(arr[i]==50) {
//				System.out.println(arr[i]);
//			}
//			for(int j =i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==50) {
//					System.out.println(arr[i]+ " "+ arr[j]);
//					
//				}
//				
//				
//				for(int k=j+1;k<arr.length;k++) {
//					if(arr[i]+arr[j]+arr[k]==50) {
//						System.out.println(arr[i]+ " "+arr[j] + " "+ arr[k]);
//					}
//					
//					for(int l=k+1;l<arr.length;l++) {
//						if(arr[i]+arr[j]+arr[k]+arr[l]==50) {
//							System.out.println(arr[i]+ " "+arr[j] + " "+ arr[k]+ " "+arr[l]);
//						}
//					}
//					
//					
//				}
//			}
//		}

