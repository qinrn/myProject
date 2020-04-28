package train.arithmetic.summary.paixu;

import java.util.Arrays;

/**
 * 常规排序方法
 * 按照顺序，每轮指定一个数字i，在数组中从i+1 开始比较，进行排序直到末位，开始下一轮
 * 
 * 复杂度 O(n^2)
 */
public class CHGPX {

	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		
		int[] result = chgSort(arr);
		
		System.out.println(Arrays.toString(result));

	}

	public static int[] chgSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
