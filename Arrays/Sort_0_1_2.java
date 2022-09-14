package ArraysQ;

import java.util.Arrays;

public class Sort_0_1_2 {
	//Dutch National Flag Algorithm
	public static void main(String[] args) {
		int[] arr = {0,1,1,0,1,2,1,2,0,0,0,1};
		int low = 0,mid = 0;
		int n = arr.length;
		int high = n-1;
		while(mid<=high) {
			if(arr[mid] == 0) {
				// swapping
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				//swapping
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
