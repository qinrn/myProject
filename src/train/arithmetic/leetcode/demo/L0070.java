package train.arithmetic.leetcode.demo;

import java.util.Scanner;

public class L0070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = climbStairs2(n);
		
		System.out.println(result);
	}

	// 斐波那契公式
	private static int climbStairs(int n) {
		double sqrt_5 = Math.sqrt(5);
		
		double ans_haf = Math.pow((1+sqrt_5)/2, n+1)-Math.pow((1-sqrt_5)/2, n+1);
		
		double ans = ans_haf/sqrt_5;
		
		return (int)ans;
	}

	// 数组递归方法
	private static int climbStairs2(int n) {
		int ans = 0;
		
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}

	// 递归方法 -> 会超时
	private static int climbStairs1(int n) {
		if(n == 0 || n==1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return climbStairs1(n-1)+climbStairs1(n-2);
	}

}
