package train.arithmetic.luogu;

import java.util.Scanner;

public class P1469_ZhaoKuaiZi_M3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10000001];
		int num;
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			num=sc.nextInt();
			a[num]++;
		}
		for (int i = 0; i < 10000001; i++) {
			if(a[i]%2==1){
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
	
	
}
