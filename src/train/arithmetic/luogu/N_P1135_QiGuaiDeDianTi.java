package train.arithmetic.luogu;

import java.util.LinkedList;
import java.util.Scanner;

public class N_P1135_QiGuaiDeDianTi {
	static int N ; 
	static int A ; 
	static int B ; 
	static int[] K ;
	static int[] book ;
	static int count ;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		
		K = new int[N + 1];
		book = new int[N + 1];
		
		count = 0;
		for (int i = 1; i <= N; i++) {
			K[i] = sc.nextInt();
			book[i] = Integer.MAX_VALUE;
			
		}
		
		BFS(A,count);
		System.out.println(count);
		
	}


	private static void BFS(int x,int count) {
		LinkedList<Integer> Q = new LinkedList<Integer>();
		
		Q.add(x);
		
		while(!Q.isEmpty()) {
			int cur = Q.poll();
			
			if (cur != B && book[K[cur]] != 1) {
				Q.add(K[K[cur]+1]);
				book[K[cur]+1] = 1;
				count += 1;
			}else if(cur == B && book[K[cur]+1] != 1) {
				book[K[cur]+1] = 1;
				count += 1;
				return ;
			}
		}
	}

}
