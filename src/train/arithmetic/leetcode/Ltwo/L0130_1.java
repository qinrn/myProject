package train.arithmetic.leetcode.Ltwo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class L0130_1 {
	static char[][] board;
	static int R;
	static int C;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		board = new char[R][C];
		
		for (int i = 0; i < R  ; i++) {
			for (int j = 0; j < C; j++) {
				board[i][j]=sc.next().charAt(0);
			}
		}
		
		solve(board);
		
		System.out.println(Arrays.deepToString(board));
	}

	private static void solve(char[][] board) {
		if (board == null || board.length == 0) return;
        if (board.length == 1 || board.length == 2 || board[0].length == 1 || board[0].length == 2) {
			return ;
		}
		int rl = board.length ;
		int cl = board[0].length;
		
		for (int j = 0; j < cl; j++) {
			if ('O' == board[0][j]) {
				board[0][j] = 'B';
				BFS(0,j);
			}
			if('O' == board[rl-1][j]) {
				board[rl-1][j] = 'B';
				BFS(rl-1,j);
			}
		}
		
		for (int i = 1; i < rl-1; i++) {
			if ('O' == board[i][0]) {
				board[i][0] = 'B';
				BFS(i,0);
			}
			if('O' == board[i][cl-1]) {
				board[i][cl-1] = 'B';
				BFS(i,cl-1);
			}
		}
		
		for (int i = 0; i < rl; i++) {
			for (int j = 0; j < cl; j++) {
				if (board[i][j] == 'O') {
					board[i][j] = 'X';
				}
			}
		}
		
		
		for (int i = 0; i < rl; i++) {
			for (int j = 0; j < cl; j++) {
				if (board[i][j] == 'B') {
					board[i][j] = 'O';
				}
			}
		}
		
	}

	private static void BFS(int x, int y) {
		LinkedList<int[]> list = new LinkedList<int[]>();
		
		list.add(new int[] {x,y});
		
		while (!list.isEmpty()) {
			int[] curr = list.poll();
			int curx = curr[0];
			int cury = curr[1];
			
			//上
			if (curx - 1 >=0 && board[curx-1][cury] == 'O') {
				board[curx-1][cury] = 'B';
				list.add(new int[]{curx-1,cury});
			}
			//下
			if (curx + 1 < board.length && board[curx+1][cury] == 'O' ) {
				board[curx+1][cury] = 'B';
				list.add(new int[]{curx+1,cury});
			}
			
			//左
			if (cury - 1 >=0 && board[curx][cury-1] == 'O' ) {
				board[curx][cury-1] = 'B';
				list.add(new int[]{curx,cury-1});
			}
			//右
			if (cury + 1 < board[0].length && board[curx][cury+1] == 'O' ) {
				board[curx][cury+1] = 'B';
				list.add(new int[]{curx,cury+1});
			}
			
		}
		
	}
	
	

}
