package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] arr = {2,5,9,6,4,3,8,4,7,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("=============");
		/*
		
		//method - 1 -> So first  of we will sort the array
		//and then we will traverse the array if arr[i] == arr[i+1] then we will say duplicate is present
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i<arr.length-1;i++) {
//			System.out.println(i);
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
				break;
			}
		}
		
		*/
		System.out.println("================");
		/*
		//method - 2 -> So in this method we will use HashMap. So I will add the element in the HashMap and
		//Continuously check whether element present in the HashMap or not If it is present in the HashMap then i 
		//will return it.
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<arr.length;i++) {
			count++;
			if(map.containsKey(arr[i])) {
				System.out.println(arr[i]);
//				break;
			}
			map.put(arr[i],i);
		}
		
		*/
		System.out.println("=============");
		//method - 3-> So in this method we will create one array of size (arr.length+1).
		//So in this method we will traverse the array and marked that element as 1 at the index of newly create array
		
		int n = arr.length;
		int[] arr_new = new int[n+1];
		for(int i = 0;i<n;i++) {
			int x = arr[i];
			if(arr_new[x] == 1) {
				System.out.println(x);
				break;
			}
			arr_new[x] = 1;
		}
		System.out.println(Arrays.toString(arr_new));
		
	}
}
