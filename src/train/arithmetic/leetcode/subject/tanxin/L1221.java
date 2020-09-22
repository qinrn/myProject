package train.arithmetic.leetcode.subject.tanxin;

import java.util.Scanner;

/**
 * title: 1221分割平衡字符串
 *
 */
public class L1221 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int result = balancedStringSplit(str);
		
		System.out.println(result);
	}

	private static int balancedStringSplit(String str) {
		int count = 0;
		int num = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'L') {
				num--;
			}else{
				num++;
			}
			if(num == 0) {
				count++;
			}
		}
		
		return count;
	}
}
