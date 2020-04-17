package train.arithmetic.summary.paixu;

import java.util.Arrays;

/**
 * 插入排序
 *
 */
public class CHRPAX {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		
		int[] result = chrSort2(arr);
		
		System.out.println(Arrays.toString(result));
		long xiaohao = System.nanoTime()-start;
		System.out.println(xiaohao);

	}

	// method -- 2
	public static int[] chrSort2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			
			// 从有序部分最右边开始找，找到比它小的数,放到右面; 
			while(j > 0 && temp < arr[j-1]) {
				arr[j] = arr[j-1];
				j-- ;
			}
			if (j != i) {
				arr[j] = temp;
			}
		}
		
		return arr;
	}

	// method -- 0
	public static int[] chrSort(int[] arr) {
		for(int i = 1 ;i<arr.length;i++) {
            int temp = arr[i];
            int j;
            for(j =i-1; j>=0&&arr[j]>temp;j--) {
                arr[j+1] = arr[j];  
            }
             arr[j+1] = temp;  
        }
		return arr;
	}

	// method -- 1
	public static int[] chrSort1(int[] arr) {
		// 从下标为 1 的开始第一轮插入排序， 因为下标为0的 只有一个元素，默认有序
		for (int i = 1; i < arr.length; i++) {
			// 要插入的数据
			int temp = arr[i];
			// 从排序的最右边开始比较，找到比他小的数
			for (int j = i-1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j+1] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
