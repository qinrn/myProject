package train.arithmetic.summary.shuxue;

import java.util.Scanner;

public class GongYueShu_GongBeiShu {
	
	static int A ;
	static int B ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		
		getValue(A,B);
		
	}

	//方法3： 递归辗转相除法
	public static void getValue(int m, int n) {
		int z = m*n ; //两数之积=最小公约数*最大公倍数
		if (m > n) {
			int temp = m;
			m = n ; 
			n = temp;
		}
		
		gcd(m,n,z);
		
	}

	public static void gcd(int m, int n,int z) {
		if (m == 0) {
			System.out.println("最大公约数："+ n +";最小公倍数："+(z/n));
			return;
		}
		
		gcd(n%m, m,z);
		
	}

	//方法2：辗转相除法
	public static void getValue2(int m, int n) {
		int z = m*n ; //两数之积=最小公约数*最大公倍数
		int max = 0 ;
		int min = 0;
		
		if (m > n) {
			int temp = m;
			m = n ; 
			n = temp;
		}
		
		int r = 0;
		while(m!=0) {
			r = n%m;
			n = m ;
			m = r;
		}
		
		max = n;
		min = z/n;
		
		System.out.println("最大公约数："+max+";最小公倍数："+min);
		
		
	}

	//方法1
	public static void getValue1(int m, int n) {
		int max = 0 ; // 最大公约数
		int min = 0; //最小公倍数
		
		if (m > n ) { //让 m 为更小的数
			int temp = m ;
			m = n ;
			n = temp;
		}
		
		for (int i = 1; i <= m; i++) {
			if (m%i == 0 && n%i==0) { //m，n 除以i，余数均为0时，i为最大公约数
				max = i;
			}
		}
		
//		min = (n/max)* (m/max)*max ;
		min = (n*m)*max ;
		
		System.out.println("最大公约数："+max+";最小公倍数："+min);
		
	}

}
