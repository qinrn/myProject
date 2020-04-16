package train.arithmetic.summary.paixu;

import java.util.Arrays;

/**
 * 冒泡排序
 * 两两比较相邻记录的关键字，如果第i位大于第i+1位的数字，交换数字
 * 
 * 复杂度 O(n^2)
 *
 */

public class MPPX {

	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		
		int[] result = mpSort(arr);
		
		System.out.println(Arrays.toString(result));

	}

	public static int[] mpSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
}
