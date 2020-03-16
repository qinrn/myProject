package train.arithmetic.leetcode.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L0001 {

	public static void main(String[] args){
		int[] nums = {2,7,11,15};
		int target = 9 ; 
		
//		int[] twoNum = twoSum(nums,target);
		int[] twoNum = twoSum1(nums,target);
		System.out.println(Arrays.toString(twoNum));
	}

	public static int[] twoSum1(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
			int val = target - nums[i];
			if (map.containsKey(val)) {
				return new int[] {map.get(val),i};
			}
			
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}

	public static int[] twoSum(int[] nums, int target){
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if((nums[i]+nums[j]) == target) {
					return new int[]{i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
