package train.arithmetic.leetcode.demo;

import java.util.Scanner;

public class L0509 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = fib1(n);
		
		System.out.println(result);
		
	}
	
	// 数组法
	private static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i <= n ; i++) {
			dp[i] = dp[i-1] +dp[i-2];
		}
		return dp[n];
	}

	// 递归   -- 慢，容易超时
	private static int fib2(int n) {
		if (n == 0 ) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		return fib(n-1)+fib(n-2);
	}

	//公式法：Math.pow(a,b);b为n还是为n+1取决于f(0)为0还是为1，为0则为n，为1则为n+1
	private static int fib1(int n) {
		if (n <= 1) {
			return n;
		}
		double sqrt5 = Math.sqrt(5);
		double ans_half = Math.pow((1+sqrt5)/2, n) - Math.pow((1-sqrt5)/2, n);
		double ans = ans_half/sqrt5 ;
		
		return (int) ans;
	}

}
