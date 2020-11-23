package train.arithmetic.leetcode.exercise;

import java.util.Scanner;

public class L504_QiJinZhiShu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		to_Server(n);
		
	}

	public static void to_Server(int n) {
		boolean ok = true ;
		String ans = "";
		
		if (n == 0 ) {
			ans = "0";
		}
		
		if (n < 0) {
			ok = false;
			n = Math.abs(n);
		}
		while(n > 0) {
			int cur = n%7;
			n = n/7;
			ans = cur + ans;
			
		}
		
		if (ok == false) {
			ans = "-" + ans;
		}
		
		System.out.println(ans);
		
	}
}
