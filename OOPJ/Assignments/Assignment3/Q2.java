public class Q2{
	public static void main(String[] args){
		int arr[] = {12, 5, 23, 8, 45, 2, 19, 31};
		
		reverseArray(arr);
		
		for(int i=0;i<arr.length; i++){
			System.out.println(arr[i]+ " ");
		}
	}
	
	static void reverseArray(int[] arr){
		int n = arr.length;
		int [] temp = new int[n];
		
		for(int i=0; i<n;i++){
			temp[i] = arr[n-i-1];
		}
		
		for(int i = 0;i<n; i++){
			arr[i] = temp[i];
		}
		
	}
}