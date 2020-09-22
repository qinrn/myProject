package train.arithmetic.leetcode.Lone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class L0130 {

	static int N;
	static int M;
	static char[][] area;
	
	static ArrayList<int[]> list ; //用于存放边界o；
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		area = new char[N][M];
		list = new ArrayList<int[]>(); //用于存放边界o；
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				area[i][j] = sc.next().charAt(0);
			}
		}
		
		solve(area);
		
		System.out.println(Arrays.deepToString(area));
		
	}
	public static void solve(char[][] board) {
		if (N == 1 || N == 2 || M == 1 || M == 2) {
			return ;
		}
		
		// 将边界的o 全部换成B
		for (int j = 0; j < M; j++) {
			if (board[0][j] == 'O') {
				board[0][j] = 'B';
				list.add(new int[] {0,j});
			}
			if(board[N-1][j] == 'O') {
				board[N-1][j] = 'B';
				list.add(new int[] {N-1,j});
			}
		}
		for (int i = 1; i < N - 1 ; i++) {
			if (board[i][0] == 'O') {
				board[i][0] = 'B';
				list.add(new int[] {i,0});
			} 
			if(board[i][M-1] == 'O') {
				board[i][M-1] = 'B';
				list.add(new int[] {i,M-1});
			}
		}
		
		if (list.size() != 0) {
			// 含有边界的 O 一大块全部重新标记
			for(int[] item : list) {
				int x = item[0];
				int y = item[1];
				BFS(x,y);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (board[i][j] == 'B') {
					board[i][j] = 'O';
				}else if(board[i][j] == 'O') {
					board[i][j] = 'X';
				}
			}
		}
		
	}
	
	public static void BFS(int r, int c) {
		LinkedList<int[]> Q = new LinkedList<int[]>();
		Q.add(new int[] {r,c});
		
		while(!Q.isEmpty()) {
			int[] cur = Q.poll();
			
			int x = cur[0];
			int y = cur[1];
			
			// 左
			if ( y - 1 >= 0 && area[x][y-1] == 'O') {
				Q.add(new int[] {x,y-1});
				area[x][y-1] = 'B';
			}
			// 右
			if ( y + 1 < M && area[x][y+1] == 'O') {
				Q.add(new int[] {x,y+1});
				area[x][y+1] = 'B';
			}
			// 上
			if ( x - 1 >= 0 && area[x-1][y] == 'O') {
				Q.add(new int[] {x-1,y});
				area[x-1][y] = 'B';
			}
			// 下
			if ( x + 1 < N && area[x+1][y] == 'O') {
				Q.add(new int[] {x+1,y});
				area[x+1][y] = 'B';
			}
		}
		
	}

}
