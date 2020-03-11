package train.arithmetic.leetcode.Test;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {
	int T = 0;
	@Before
	public void test() {
		Scanner sc  = new Scanner(System.in);
		T = sc.nextInt();
	}
	
	//字符串前补零
	@Test
	public void _str() {
		
	}
	
	// 将数值转换成二进制字符串
	@Test
	public void test01() {
		String ss = Integer.toBinaryString(T);
		System.out.println(ss);
	}

}
