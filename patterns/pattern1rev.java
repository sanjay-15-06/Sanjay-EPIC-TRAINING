package patterns;

public class pattern1rev {

	public static void main(String[] args) {
		int n= 7;
		for (int i =0;i<n;i++) {
			int val =0;
			
			for (int j=0;j<n;j++) {
				if(i<=n/2) {
					if(j<=i) {
						System.out.print(++val+" ");
					}else if(i+j>=n) {
						System.out.print(--val+" ");
					}else {
						System.out.print(val+ " ");
					}
				}
			}
			System.out.println("");
			
		}
		for(int k = (n/2)-1;k>=0;k--) {
			for(int l=(n/2)-1;l>=0;l--) {
				int valu =0;
				if(k<=(n/2)-1) {
					if(l<=k) {
						System.out.print(++valu + " ");
					}else if(k+l>=n) {
						System.out.print(--valu+" ");
					}else {
						System.out.print(valu + " ");
					}
				}
			}
			System.out.println("");	
		}

	}

}
