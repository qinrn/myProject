package train.arithmetic.luogu;

import java.util.Scanner;

public class P1049_ZhuangXiangWenTi_M2 {
	static int v ;
	static int n ; 
	static int[] V ;
	static int ans ;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		n = sc.nextInt();
		
		V = new int[n+1];
		dp = new int[v+1];
		
		for (int i = 1; i <= n; i++) {
			V[i] = sc.nextInt();
		}
		
		
		  for (int i = 1; i <= n; i++) { 
			  for (int j = v; j >= V[i]; j--) { 
				  if (j >=V[i]) { 
					  dp[j] = Math.max(dp[j], dp[j-V[i]]+V[i]); 
				  }
			  }
		  }
		  
		System.out.println(v-dp[v]);

	}

}
