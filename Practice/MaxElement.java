import java.util.*;

public class MaxElement{
	public static void main(String args[]){
		int arr[] = {10, 25, 47, 85, 12};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println(max);
	
	}
}