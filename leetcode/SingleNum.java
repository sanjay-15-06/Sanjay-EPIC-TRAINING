package leetcode;

public class SingleNum {

	public static void main(String[] args) {
		int [] nums = {1,2,2,3,3,4};
		int count = 1;
        for(int i=0;i<nums.length;i++){
        	 for(int j=1;j<nums.length;j++){
        		 if(nums[i]==nums[j]){
        			 count++;
        		 }
        	 }
        	 if(count==1){
                 System.out.println(nums[i]);
              }
        }
         

	}

}
