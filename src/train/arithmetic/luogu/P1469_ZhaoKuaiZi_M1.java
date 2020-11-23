package train.arithmetic.luogu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//效率不通过
public class P1469_ZhaoKuaiZi_M1 {
	static int N ;
	static int[] arr ;
	
	static HashSet<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {
			if (set.contains(arr[i])) {
				set.remove(arr[i]);
			}else {
				set.add(arr[i]);
			}
			
		}
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		sc.close();
			
	}

}
