package ArraysQ;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int[] arr = {1,4,7,8,10};
		int[] arr2 = {2,3,9};
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] <= arr2[0]) {
				int temp = arr[i];
				arr[i] = arr2[0];
				arr2[0] = temp;
				
				for(int k = 1;k<arr2.length;k++) {
					if(arr2[k] < arr2[k-1]) {
						int temp_ = arr2[k-1];
						arr2[k-1] = arr2[k];
						arr2[k] = temp_;
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
