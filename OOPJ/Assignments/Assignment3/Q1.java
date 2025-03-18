public class Q1{
	public static void main(String args[]){
		int arr[] = {12, 5, 23, 8, 45, 2, 19, 31};
		
		findLargestAndSmallest(arr);
	}
	
	public static void findLargestAndSmallest(int arr[]){
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
			
			if(arr[i]< smallest){
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest element: " + largest);
		System.out.println("Smallest element: " + smallest);
	}
	
	
}