package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public static void main(String[] args) {
		int[][] arr = {{1,3},{8,16},{2,6},{15,18}};
		
		
		
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//        for(int[] i : arr) {
//        	for(int j = 0;j<i.length;j++) {
//        		System.out.print(i[j]+" ");
//        	}
//        	System.out.println();
//        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i=0;
        while(i< arr.length - 1){
            if(arr[i][1] >= arr[i+1][0] && arr[i][1] <= arr[i+1][1]){
                arr[i+1][0] = arr[i][0];
            }else if(arr[i+1][0] >= arr[i][0] && arr[i][1] >= arr[i+1][1]){
                arr[i+1][0] = arr[i][0];
                arr[i+1][1] = arr[i][1];
            }else{
            	ArrayList<Integer> ab = new ArrayList<>();
            	ab.add(arr[i][0]);
            	ab.add(arr[i][1]);
                result.add(ab);
            }
            i++;
        }
        System.out.println(i);
        ArrayList<Integer> xy = new ArrayList<>();
        xy.add(arr[i][0]);
        xy.add(arr[i][1]);
        result.add(xy);
        System.out.println(result);
	}
	
}
