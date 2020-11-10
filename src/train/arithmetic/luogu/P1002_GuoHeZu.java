package train.arithmetic.luogu;

import java.util.Scanner;

public class P1002_GuoHeZu {

		static int BX ;
		static int BY ;
		static int CX ;
		static int CY ;
		static char[][] area;
		static int ans;
		
		static int[] MX = {2,1,-1,-2,-2,-1,1,2};
		static int[] MY = {1,2,2,1,-1,-2,-2,-1};
		
		static int[] px = {0,1};
		static int[] py = {1,0};
		
		static int[] MAR ;
		static int[] MAC ;
		
		static long[][] dp;

		public static void main(String[] args) {
			long start = System.currentTimeMillis();
			
			Scanner sc = new Scanner(System.in);
			
			BX = sc.nextInt();
			BY = sc.nextInt();
			CX = sc.nextInt();
			CY = sc.nextInt();
			
			MAR = new int[8];
			MAC = new int[8];
			
			area = new char[BX+1][BY+1];
			dp = new long[BX+1][BY+1];
			
			
			for (int i = 0; i < BX+1; i++) {
				for (int j = 0; j < BY+1; j++) {
					area[i][j] = 'O';
				}
			}
			
			area[CX][CY] = 'M';
			for (int i = 0; i != 8; i++) {
				if (CX+MX[i] < 0 || CX+MX[i] > BX || CY+MY[i] < 0 || CY+MY[i] >BY) {
					continue;
				}
				MAR[i] = CX + MX[i];
				MAC[i] = CY + MY[i];
				area[MAR[i]][MAC[i]] = 'M';
				
			}
			if (CX == 0 || CY == 0) {
				dp[CX][CY] = 0;
			}
			
			for (int i = 0; i <= BX; i++) {
				for (int j = 0; j <= BY; j++) {
					if (area[i][j] == 'M') {
						dp[i][j] = 0;
					}else {
						if (i == 0 && j == 0) {
							dp[i][j] = 1;
						}else if(i == 0 && j >) {
							
						}
					}
					
					
					if (area[i][j] == 'M') {
						
					}else {
						
						dp[i][j] = dp[i-1][j]+dp[i][j-1];
					}
				}
			}
			
		
			System.out.println(dp[BX][BY]);
		
			sc.close();
		}

		
}
