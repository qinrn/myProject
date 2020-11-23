package train.arithmetic.demo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Test1 {

		public static boolean[] arr = new boolean[50001];
		public static int p[] = new int[5001];
		public static boolean v[] = new boolean[1000007];
		public static int cnt = 0;

		public static void main(String[] args) throws IOException {
			StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
			st.nextToken();
			int L = (int) st.nval;
			
			st.nextToken();
			int R = (int) st.nval;
			
			out.println(getSum(L, R));
			out.flush();
		}

		private static int getSum(int l, int r) {
			int n = (int) Math.min(50000, Math.sqrt(r));
			for(int i = 2; i <= n; i++) {
				if (!arr[i])
					p[++cnt] = i;
				
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
