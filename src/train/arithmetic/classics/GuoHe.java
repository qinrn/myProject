package train.arithmetic.classics;

import java.util.Arrays;
import java.util.Scanner;

public class GuoHe {
	static int N ;
	static int[] LT ;
	static int[] dp;
	static int result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tcase = 1; tcase <= T; tcase++) {
			N = sc.nextInt();
			LT = new int[N+1] ;
			dp = new int[N+1] ;
			
			for (int i = 1; i <= N; i++) {
				LT[i] = sc.nextInt();
			}
			
			
			result = getMIN();
			
			
			
			System.out.println("#"+tcase+" " +result);
		}
		
	}
	private static int getMIN() {
		Arrays.sort(LT);
		
		for (int i = 1; i <= N; i++) {
			if(i == 1) {
				dp[1] = LT[1];
			}
			
			if (i == 2) {
				dp[2] = LT[2];
			}
			
			if (i == 3) {
				dp[3] = LT[3] + LT[2] + LT[1];
			}
			if (i >= 4) {
				dp[i] = LT[1] + 2*LT[2] + LT[i] + dp[N-2]; 
			}
		}
		return dp[N] ;
		
	}

}
