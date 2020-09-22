package train.arithmetic.leetcode.subject.huisu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MST0809 {
	static int n;
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		List<String> result = generateParenthesis(n);
  		System.out.println(result);
	}
	
	 public static List<String> generateParenthesis(int num) {
		 int left = 0 ;
		 int right = 0 ;
		 
		 dfs(0,0,"");
		 
		 return list;
     }

	private static void dfs(int left, int right, String str) {
		if (left == n && right == n) {
			list.add(str) ;
			return;
		}
		
		if (left+1<=n) {
			dfs(left+1,right,str+"(");
		}
		
		if (right+1 <= left) {
			dfs(left,right+1,str+")");
		}
	}

}
