package train.arithmetic.leetcode.summary.tanxin;

import java.util.Scanner;

/**
 * title: 944删列造序 
 *
 */
public class L0944 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		String[] A = new String[L]; 
		
		for (int i = 0; i < L; i++) {
			String N = sc.next();
			A[i] = N;
		}
		int result = minDeletionSize(A);
		
		System.out.println(result);
	}

	private static int minDeletionSize(String[] A) {
		int count = 0;
		for (int i = 0; i < A[0].length(); i++) {
			for (int j = 0; j < A.length -1; j++) {
				if (A[j].charAt(i) > A[j+1].charAt(i)) {
					count++;
					break;
				}
			}
		}
		return count;
	}

}
