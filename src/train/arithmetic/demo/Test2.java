package train.arithmetic.demo;

import java.util.Scanner;

public class Test2 {

	static long L ;
	static long R ;
	static int ans ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		L = sc.nextInt();
		R = sc.nextInt();
		
		ans = 0 ;
		
		if(L == 2) {
			ans += 2;
			L = L+3 ;
		}else if(L == 3) {
			ans += 1;
			L = L+1 ;
		}else if(L%2 == 0) {
			L += 1;
		}
		
		for (long i = L; i <= R; i += 2) {
			boolean ok = false ;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j != 0 ) {
					ok = true; // 说明该数是质数
				}else if (i%j == 0 ) {
					ok = false;
					break;
				}
			}
			
			if (ok) {
				ans += 1;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
		
	}

}
