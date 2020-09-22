package train.arithmetic.leetcode.subject.tanxin;

import java.util.Scanner;

public class L1518 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nunBottles = sc.nextInt(); // 有多少
		int numExchange = sc.nextInt(); // 有多少后可换
		
		int result = numWaterBottles(nunBottles,numExchange);
		
		System.out.println(result);
	}

	private static int numWaterBottles(int n, int m) {
		int count = n;
		int num = n;	// 当前空瓶
		int exch = 0 ; //当前已换酒数
		
		while(num >= m){
			exch = num / m ;
			num = (num % m)+exch ;
			count += exch; 
		}
		
		return count;
	}

}
