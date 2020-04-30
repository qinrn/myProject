package train.arithmetic.summary.paixu;

import java.util.Arrays;

//基数排序
public class JJSSPX {
	
	public static void main(String[] args) {
		int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		int[] result = JSJSPX(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] JSJSPX(int[] arr) {
		// 获取数组中数据最大位数
		int maxDigit = getMaxDigit(arr);
		//根据数据和最大位数排序
		return radixSort(arr,maxDigit);
	}

	private static int[] radixSort(int[] arr, int maxDigit) {
		int mod = 10;
		int dev = 1;
		
		
		for (int i = 0; i < maxDigit; i++,dev *= 10,mod *= 10) {
			//定义二维数组，一维20个元素，0~9 代表负数，10~19 代表正数
			int[][] counter = new int[mod * 2][0];
			for (int j = 0; j < arr.length; j++) {
				int bucket = (arr[j]% mod) + 10;
				counter[bucket] = arrayAppend(counter[bucket],arr[j]);
			}
			
			int pos = 0;
			for (int[] bucket : counter) {
				for (int vs : bucket) {
					arr[pos++] = vs;
				}
			}
		}
		
		return arr;
	}

	private static int[] arrayAppend(int[] is, int value) {
		is = Arrays.copyOf(is, is.length + 1);
		is[is.length -1] = value;
		
		return is;
	}

	private static int getMaxDigit(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int item: arr) {
			max = Math.max(max, item);
		}
		
		if (max == 0) {
			return 1;
		}
		
		int len = 0;
		for (int temp = max; temp != 0 ; temp /= 10) {
			len++;
		}
		return len;
	}
}
