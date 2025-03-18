class Q3{
	public static void main(String args[]){
		int arr[] = {12, 5, 23, 8, 45, 2, 19, 31, 40};
		
		secondLargest(arr);
	}
	
	public static void secondLargest(int array[]){
		int largest = array[0];
		int lastSecond = array[0];
		
		for(int i=0; i<array.length; i++){
			if(largest<array[i]){
				largest = array[i];
			}
		}
		for(int i=0; i<array.length; i++){
			if(lastSecond<array[i] && array[i]!=largest){
				lastSecond = array[i];
			}
		}
		System.out.println("Second Largest element is: " + lastSecond);
	}
}