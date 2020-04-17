package train.arithmetic.summary.paixu;

import java.util.Arrays;

/**
 * 选择排序
 * 1. 定义一个最小下标
 * 2. 找到代码中
 */
public class XZPX {
	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		
		int[] result = xzSort(arr);
		
		System.out.println(Arrays.toString(result));
	}

	public static int[] xzSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		return arr;
	}
}
