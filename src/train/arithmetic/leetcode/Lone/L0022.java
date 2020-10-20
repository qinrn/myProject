package train.arithmetic.leetcode.Lone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L0022 {
	static List<String> resultList = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<String> list = generateParenthesis(n);
		
		System.out.println(list);
	}

	public static List<String> generateParenthesis(int n) {
		DFS(0,0,n,"");
		
		return resultList;
	}

	public static void DFS(int left, int right, int n,String path) {
		if (left > n || left < right ) {
			return ;
		}
		
		if (left == n && right == n ) {
			resultList.add(path);
			return;
		}
		
		DFS(left+1,right,n,path+"(");
		DFS(left,right+1,n,path+")");
		
	}
}
