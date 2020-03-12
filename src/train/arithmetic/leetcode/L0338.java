package train.arithmetic.leetcode;

import java.util.Arrays;
import java.util.Scanner;

//动态规划，位运算
public class L0338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr = countBits(num);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] countBits(int num) {
		int len = (Integer.toBinaryString(num)).length();
		int count = 0;
		int[] arrys = new int [num + 1];

		for (int i = 0; i <= num; i++) {
			String str = Integer.toBinaryString(i);
			while(str.length()!=len) {
				str = "0" + str;
			}
			
			for (int j = 0; j < str.length(); j++) {
				if ("1".equals(String.valueOf(str.charAt(j)))) {
					count += 1;
				}
			}
		
			arrys[i] = count ; 
			count = 0;
		}
		
		return arrys;
	}

}
