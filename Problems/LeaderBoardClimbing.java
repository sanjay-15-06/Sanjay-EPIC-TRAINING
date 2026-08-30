package Problems;

import java.util.Scanner;

public class LeaderBoardClimbing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] ranked = new int[n];
	    ranked[0]=sc.nextInt();
	    for(int i =1;i<n;){
	        	int temp = sc.nextInt();
	        
	        if(temp!=ranked[i-1]) {
	        	ranked[i]=temp;
	        	i++;
	        }
	        else if(temp==ranked[i-1]) {
	        	n--;
	        }
	    } 
	    for(int i=0;i<n;i++) {
	    	System.out.print(ranked[i] + " ");
	    }
	    
	    
	    int m= sc.nextInt();
	    int[] player = new int[m];
	    for(int i =0;i<m;i++){
        	player[i] = sc.nextInt();
	    }
		
		
	    
	   
	    System.out.println("rank : ");
	    for(int i=0;i<player.length;i++){
	    	int rank=1;
	    	for(int j =0;j<ranked.length;j++) {
	    		if(player[i]<ranked[j]) {
	    			rank++;
	    		}
	    		
	    	}
			System.out.println(rank);

	    	
	    }
	    
	}

}
