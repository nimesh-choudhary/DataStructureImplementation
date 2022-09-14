package ArraysQ;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		//right rotate
		int k = 2;
		k = k % arr.length;
		//so we use if we rotate array arr.length times then array will remain same
		while(k>0) {
			int x = arr[0];
			for(int i = 0;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
			}
			int n = arr.length-1;
			arr[n] = x;
			k--;
		}
		System.out.println(Arrays.toString(arr));
		
		
		/*
		//left rotate
		int k = k % arr.length;
		int n = arr.length-1;
		int x = arr[n];
		for(int i = n;i>=1;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = x;
		System.out.println(Arrays.toString(arr));
		
		
		*/
	}
}
