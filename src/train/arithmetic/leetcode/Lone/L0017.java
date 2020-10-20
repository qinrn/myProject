package train.arithmetic.leetcode.Lone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class L0017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 结果集
		List<String> resList = new ArrayList<String>();
		
		Map<Character, String> map = new HashMap<Character, String>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		DFS(resList,map, str,0,new StringBuffer());
		System.out.println(resList);
	}

	private static void DFS(List<String> resList, Map<Character, String> map, String digits, int index, StringBuffer selList) {
		
		if (index == digits.length()) {
			resList.add(selList.toString());
		}else {
			char digit = digits.charAt(index);
			String currStr = map.get(digit);
			int curLen = currStr.length();
			for (int i = 0; i < curLen; i++) {
				selList.append(currStr.charAt(i));
				DFS(resList , map , digits, index+1 , selList);
				selList.deleteCharAt(index);
			}
		}
	}



}
