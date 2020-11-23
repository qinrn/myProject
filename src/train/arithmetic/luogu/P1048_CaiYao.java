package train.arithmetic.luogu;

import java.util.Scanner;

public class P1048_CaiYao {
	static int T ;
	static int n ; 
	static int[] time ;
	static int[] price ;
	static int ans ;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		n = sc.nextInt();
		
		time = new int[n+1];
		price = new int[n+1];
		dp = new int[T+1];
		
		for (int i = 1; i <= n; i++) {
			time[i] = sc.nextInt();
			price[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = T; j >= time[i]; j--) {
				if (j >= time[i]) {
					dp[j] = Math.max(dp[j], dp[j-time[i]]+price[i]);
//					System.out.println(j + ":" + dp[T]);
				}
			}
		}
		System.out.println(dp[T]);
		

	}


}
