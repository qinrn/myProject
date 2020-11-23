package train.arithmetic.luogu;

import java.util.Scanner;

public class P1029_ZuiDaGongYueShuHeZuiXiaoGongBeiShuWenTi {
	
	static int max ;
	static int min ;
	static int JI ;
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		max = sc.nextInt();
		min = sc.nextInt();
		
		JI = max * min;
		
		int halfJI = (int) Math.sqrt(JI);
		
		for (int i = 1; i <= halfJI; i++) {
			if (JI%i == 0 && gcd(i,JI/i) == max) {
				ans++;
			}
			
		}
		
		if (max == min) {
			System.out.println(ans);
		}else {
			System.out.println(ans*2);
		}
		
		
	}

	private static int gcd(int x, int y) {
		if (x == 0) return y ;
		else return gcd(y%x,x);
	}


}
