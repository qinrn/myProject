package train.arithmetic.summary.paixu;

import java.util.Arrays;

// 计数排序
public class JSPX {

	public static void main(String[] args) {
		int[] arr = {8, 1, 4, 6, 2, 3, 5, 4};
		int[] result = countSort(arr);
		
		System.out.println(Arrays.toString(result));

	}

	//8, 1, 4, 6, 2, 3, 5, 4
	private static int[] countSort(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		//求出最大数最小数
		for(int num:arr) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		// 定义用来计算元素个数的新数组，长度位（max-min+1）+1
		int[] count = new int[(max - min +1)+1];
		//统计
		for (int n:arr) {
			count[n-min+1]++;
		}

		int index = 0 ; 
		// 创建结果数组
	    int[] result = new int[arr.length];
	    
	    
	    // 遍历arr中的元素，填充到结果数组中去，从前往后遍历
	    for (int i=0; i < count.length; i++) {
	      for (int j = 0; j < count[i]; j++) {
	    	  result[index++] = i;
			
	      }
	    }
	    return result;
	}

}
