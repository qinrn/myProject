package train.arithmetic.luogu;

import java.util.Scanner;

public class N_P1164_XiaoADianCai {
	
	static int N ;
	static int M ;
	static int[] arr ;
	static int ans ;
	static int[] book;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N +1];
		book = new int[N +1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		
	}

}
