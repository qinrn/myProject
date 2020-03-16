package train.arithmetic.leetcode.one;

import java.util.Scanner;

public class L0877 {
	static int N;
	static int[] piles;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] piles = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			piles[i] = sc.nextInt();
		}
		
		
		boolean ok = stoneGame(piles);
		System.out.println(ok);
	}

	private static boolean stoneGame(int[] piles) {
		int sumAlex = 0;
		return false;
	}

}
