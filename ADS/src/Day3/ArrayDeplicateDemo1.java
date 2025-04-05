package Day3;

import java.util.Arrays;

//sorting approach 
//Time complexity: O(n)
//Space complexity: O(n)
public class ArrayDeplicateDemo1 {
	public static void main(String args[]) {
		int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);//O(nlogn)
		System.out.println(Arrays.toString(arr));
		
		//logic for duplicate identification
		for(int i=0; i<arr.length; i++) {
				if(arr[i] == arr[i+1]) {
					System.out.println(arr[i]);
				}
		}
	}
}
