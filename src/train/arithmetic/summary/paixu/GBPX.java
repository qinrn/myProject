package train.arithmetic.summary.paixu;

import java.util.Arrays;

public class GBPX {

	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		int[] result = gbSort(arr);
		
		System.out.println(Arrays.toString(result));
	}

	public static int[] gbSort(int[] arr) {
		int[] temp = new int[arr.length];	//先建立一个和原数组长度相同的临时数组；避免递归过程中频繁开辟空间
		sort(arr , 0 ,arr.length -1 , temp);
		return arr;
	}

	public static void sort(int[] arr, int left, int right, int[] temp) {
		if (left < right) {
			int mid = (left + right)/2;
			sort(arr, left , mid , temp); //左边子序列归并排序
			sort(arr, mid+1, right , temp); // 右边子序列归并排序
			merge(arr, left, mid , right, temp); //合并两个子系列
		}
	}

	private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
		int i = left ; // 做序列指针
		int j = mid + 1 ; // 右序列指针
		int t = 0; // 临时数组指针
		
		while(i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[t++] = arr[i++];
			}else {
				temp[t++] = arr[j++];
			}
		}
		
		while(i <= mid ) { //将左序列剩余元素填到temp中
			temp[t++] = arr[i++];
		}
		while(j <= right ) { //将右序列剩余元素填到temp中
			temp[t++] = arr[j++];
		}
		
		t = 0;
		// 将temp 中元素填到arr中；
		while(left <= right){
			arr[left++] = temp[t++];
        }
		
	}

}
