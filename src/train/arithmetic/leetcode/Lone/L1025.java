package train.arithmetic.leetcode.Lone;

import java.util.Scanner;

public class L1025 {
	static int N ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		boolean ok = divisorGame(N);
		
		System.out.println("Alice is " + ok);
		
	}

	private static boolean divisorGame(int n) {
		boolean []win = new boolean[n+1];
		if (n == 1 ) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					if(!win[i-j]) {
						win[i] = true;
						break;
					}
				}
			}
		}
		
		
		return win[n];
	}
}
