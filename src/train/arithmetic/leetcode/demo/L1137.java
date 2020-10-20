package train.arithmetic.leetcode.demo;

import java.util.Scanner;

public class L1137 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = tribonacci(n);
		
		System.out.println(result);
	}

	// 数组法
	private static int tribonacci(int n) {
		int[] dp = new int[n+4];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		
		for (int i = 0; i <= n; i++) {
			dp[i+3] = dp[i]+dp[i+1]+dp[i+2];
		}
		return dp[n];
	}
}
