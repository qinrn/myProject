package train.arithmetic.summary.paixu;

import java.util.Arrays;

public class shellPX {

	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		
		int[] result = shellSort(arr);
		
		System.out.println(Arrays.toString(result));
	}

	// method -- 2 
	public static int[] shellSort2(int[] arr) {
		// 设置增量gap, gap为arr长度的1/2 ，gap 每次
		for (int gap = arr.length/2; gap > 0; gap /= 2) {
			// 对个分组进行插入排序
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				while(j-gap >= 0 && arr[j] < arr[j-gap]) {
					swap(arr, j , j-gap);
					j -= gap ;
				}
			}
		}
		
		return arr;
	}


	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		// 这种方法交换数据也可以，好处在于不需要开辟新的空间，即内存消耗的小
//		arr[a] = arr[a]+arr[b];
//		arr[b] = arr[a]-arr[b];
//		arr[a] = arr[a]-arr[b];
	}




	// method --1
	public static int[] shellSort(int[] arr) {
		
		// 增量gap, 并且逐步缩小增量,m 增量变化以每轮源增量除以2
		for (int gap = arr.length /2 ; gap > 0; gap /= 2) {
			//对各个分组进行插入排序
			for (int i = gap; i < arr.length; i++) {
				insertI(arr,gap,i);
			}
		}
		
		return arr;
	}

	public static void insertI(int[] arr, int gap, int i) {
		int inserted = arr[i];
		int j ;
		for (j = i-gap; j >= 0 && inserted < arr[j]; j -= gap){
			arr[j+gap] = arr[j];
		}
		arr[j+gap] = inserted;
		
	}

}
