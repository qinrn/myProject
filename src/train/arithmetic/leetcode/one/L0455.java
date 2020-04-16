package train.arithmetic.leetcode.one;

import java.util.Arrays;
import java.util.Scanner;

public class L0455 {
	static int gNum ;
	static int sNum ;
	static int[] Gi;
	static int[] Si;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		gNum = sc.nextInt();
		sNum = sc.nextInt();
		
		Gi = new int[gNum];
		Si = new int[sNum];
		
		for (int i = 0; i < gNum; i++) {
			Gi[i] = sc.nextInt();
		}
		for (int j = 0; j < sNum; j++) {
			Si[j] = sc.nextInt();
		}
		
		int result = findContentChildren(Gi,Si);
		
		System.out.println(result);

	}

	// method2 -- 耗时 9ms
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int gi = 0;
		int si = 0;
		while(gi < g.length && si < s.length) {
			if (s[si] >= g[gi] ) {
				gi++ ;
			}
			si++;
		}
		
		return gi;
	}

	// method1 -- 耗时 228ms
	public static int findContentChildren1(int[] g, int[] s) {
		Arrays.sort(s);
		Arrays.sort(g);
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (s[i] >= g[j] && s[i] != -1 && g[j] != -1) {
					s[i] = -1 ;
					g[j] = -1;
					continue;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == -1) {
				count = count + 1;
			}
		}
		return count;

    }
}
