import java.util.Arrays;

public class MiddleElement{
	public static void main(String args[]){
		int arr[] = {7,2,9,4,6,5,8};
		arrangeArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void arrangeArray(int arr[]){
		int n = arr.length;
		if(n==0) return;
		
		int mid = n/2;
		
		//left part
		int left[] = new int[mid];
		for(int i=0; i<mid; i++){
			left[i] = arr[i];
		}
		Arrays.sort(left);
		
		//right part
		int rightSize = n-mid-1;
		int right[] = new int[rightSize];
		for(int i=0; i<rightSize; i++){
			right[i] = arr[mid+1+i];
		}
		Arrays.sort(right);
		
		//Reverse the right array for descending order
		for(int i = 0; i<rightSize/2; i++){
			int temp = right[i];
			right[i] = right[rightSize -1 -i];
			right[rightSize - 1 - i] = temp;
		}
		
		//merge back to original array
		for(int i=0; i<mid; i++){
			arr[i] = left[i];
		}
		//middle element remain unchanged
		for(int i=0; i<rightSize; i++){
			arr[mid + 1 + i] = right[i];
		}
		
	}
}