package train.arithmetic.summary.paixu;

import java.util.Arrays;

//堆排序
public class DPX {

	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		int[] result = dSort(arr);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] dSort(int[] arr) {
		for (int i = arr.length/2-1; i >= 0; i--) {
			// 倒数第一个非叶子节点开始，自下而上
			adjustSort(arr,i,arr.length);
		}

		//交换堆顶元素和末尾元素
		for (int j = arr.length-1; j > 0 ; j--) {
			swap(arr,0,j);
			adjustSort(arr, 0, j);
		}
		
		return arr;
	}

	private static void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] +arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
		
	}

	private static void adjustSort(int[] arr, int i, int length) {
		int temp = arr[i];
		
 		for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
			if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
				k++;
			}
			if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
				arr[i] = arr[k];
				i = k;	
			}else{
				break;
			}
		}
		arr[i] = temp;//将temp值放到最终的位置
		
	}

}
