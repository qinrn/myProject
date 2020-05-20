package train.arithmetic.leetcode.Test;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {
	Scanner sc  = new Scanner(System.in);
	int num = sc.nextInt();
	
	// 将数值转换成二进制字符串
	@Test
	public void test01() {
		String ss = Integer.toBinaryString(num);
		System.out.println(ss);
	}
	
	//二维数组打印
	@Test
	public void test02(){
		char[][] area = new char[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				area[i][j] = sc.next().charAt(0);		// 字符间有空格的输入方法
			}
		}
		
		System.out.println(Arrays.deepToString(area));
	}
	
	// 位运算之补位
	public void test03(){
		int len = (Integer.toBinaryString(num)).length();
		int[] arrys = new int [num + 1];
		int count = 0;

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
	}

}
