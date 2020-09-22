package train.arithmetic.leetcode.Lone;

import java.util.Scanner;

public class L860 {
	static int N;
	static int[] bill;
	static boolean result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		bill = new int[N];
		for (int i = 0; i < N; i++) {
			bill[i] = sc.nextInt();
		}
		
		result = lemonadeChange(bill);
		
		System.out.println(result);
		
	}
	public static boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
		int tewnty = 0;
		
		for (int i:bills) {
			if (i == 5) {
				five++;
			}else if(i == 10) {
				if (five == 0) {
					return false;
				}
				five--;
				ten++;
			}else if(i == 20) {
				tewnty++;
				if (ten == 0) {
					five--;
					five--;
				}else {
					ten--;
				}
				five--;
			}
			
			if (five < 0 || ten < 0) {
				return false;
			}
		}
		
		return true;
	}
}
