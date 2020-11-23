package train.arithmetic.luogu;

import java.util.Scanner;

public class P1835_SuShuMiDu_M1 {
	
	static int L ;
	static int R ;
	static int ans ;
	static int cnt ;
	static boolean[] arr ;
	static int p[];
	static boolean v[] = new boolean[1000007];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		L = sc.nextInt();
		R = sc.nextInt();
		
		arr = new boolean[50001];
		p = new int[5001];
		v = new boolean[1000007];
		
		ans = 0 ;
		cnt = 0 ;
		
		System.out.println(getSum(L,R));
		sc.close();
	}
	
	public static int getSum(int l, int r) {
		int n = (int) Math.min(50000, Math.sqrt(r));
		for(int i = 2; i <= n; i++) {
			if (!arr[i])p[++cnt] = i;
			
			for(int j = 1; j <= cnt && i * p[j] <= n; j++) {
				arr[i * p[j]] = true;
				if (i % p[j] == 0)
					break;
			}
		}
		
		for(int i = 1; i <= cnt; i++) {
			int x = r / p[i] * p[i];
			while(x > p[i] && x >= l) {
				v[x - l] = true;
				x -= p[i];
			}
		}
		
		int res = 0;
		for(int i = 0; i <= r - l; i++) {
			if (!v[i])
				++res;
		}
		return res;
	}
}
