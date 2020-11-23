package train.arithmetic.luogu;

import java.util.Arrays;
import java.util.Scanner;

public class N_P1004_FangGeQuShu {

	static int N ;
	static int[][] area ;
	static int[][] map ;
	
	static int[][] dpA ;
	static int[][] dpB ;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		area = new int[N+1][N+1];
		map = new int[N+1][N+1];
		dpA = new int[N+1][N+1];
		dpB = new int[N+1][N+1];
	
		while(sc.hasNext()) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int v = sc.nextInt();
			area[r][c] = v;
		}
		
		map = area;
		
		DFS(dpA, area , 0,0);
		
		
		
		
		
		System.out.println(Arrays.deepToString(area));

	}


	public static void DFS(int[][] A, int[][] arr, int x, int y) {
		if (x == N+1 && y == N+1) {
			dpA[x][y] = dpA[x][y];
			return ;
		}
		
		
		
		
		
	}


	

}
