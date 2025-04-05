package Day3;

import java.util.Arrays;

//Brute force approach (nested loop)
//Time complexity: O(n^2)
//Space complexity: O(1)
public class ArrayDuplicateDemo {
	public static void main(String args[]) {
		int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
		//System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
