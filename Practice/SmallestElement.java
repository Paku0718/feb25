import java.util.*;

public class SmallestElement{
	public static void main(String args[]){
		int arr[] = {10, 25, 47, 85, 12};
		int small=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<small){
				small = arr[i];
			}
		}
		System.out.println(small);
	}
}