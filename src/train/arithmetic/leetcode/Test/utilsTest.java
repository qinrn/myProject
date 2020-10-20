package train.arithmetic.leetcode.Test;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class utilsTest {
	int T = 0;
	
//	@Before
//	public void test() {
//		Scanner sc  = new Scanner(System.in);
//		T = sc.nextInt();
//	}
	
	// 将数值转换成二进制字符串
	@Test
	public void test01() {
		String ss = Integer.toBinaryString(T);
		System.out.println(ss);
	}
	
	@Test
	public void test02(){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		char[][] arrs = {{'A','B','C'},{'D','E','F'},{'g','i','o'}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arrs));
	}
	
	

}
