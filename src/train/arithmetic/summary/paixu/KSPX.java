package train.arithmetic.summary.paixu;

import java.util.Arrays;

public class KSPX {

	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		
		int[] result = ksSort(arr);
		
		System.out.println(Arrays.toString(result));

	}

	public static int[] ksSort(int[] arr) {
		sort(arr,0,arr.length-1);
		return arr;
	}

	public static void sort(int[] arr, int _left, int _right) {
		int left = _left;
		int right = _right;
		int temp = 0;
		
		if (left <= right) {
			// 设置基准值
			temp = arr[left];
			while(left != right) {
				while(left < right && arr[right] >= temp) { //从右往左扫描
					right--;
				}
				arr[left] = arr[right];
				while(left < right && arr[left] <= temp) { //从左往右扫描
					left++;
				}
				arr[right] = arr[left];
				
				
			}
			
			arr[right] = temp;
			sort(arr, _left, left-1);
			sort(arr,right+1,_right);
			
			
		}
		
	}

}
