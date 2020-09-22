package train.arithmetic.leetcode.summary.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @title: 非递增顺序的最小序列
 */
public class L1403 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = {4,3,10,9,8};
		
		List<Integer> result = minSubsequence(nums);
		
		System.out.println(result);
		
	}

	private static List<Integer> minSubsequence(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		
		for (int num: nums) {
			sum = sum + num ;
		}
		
		Arrays.sort(nums);
		int curNum = 0;
		
		for (int i = nums.length - 1; i >= 0; i--) {
			curNum += nums[i];
			list.add(nums[i]);
			int curSum = sum - curNum;	
			
			if (curNum > curSum) {
				break;
			}
			
		}
		
		
		return list;
	}
	
}
