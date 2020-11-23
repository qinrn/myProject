package train.arithmetic.luogu;

import java.util.Scanner;

public class P1469_ZhaoKuaiZi_M2 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int res = 0;
	for (int i = 0; i < n; i++) {
		res = res ^ s.nextInt();
	}
	System.out.println(res);
	s.close();
}}
