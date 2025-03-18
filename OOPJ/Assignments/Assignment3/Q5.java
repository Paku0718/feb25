class Q5{
	public static void main(String args[]){
		int arr[] = {2,3,4,5,6,7,8,9,10,12,4};
		result(arr);
		
	}
	
	public static void result(int array[]){
		float avg, sum = 0;
		
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		avg = sum/array.length;
		
		System.out.println("Sum of given array: " + sum);
		System.out.println("Average of given array: " + avg);
	}
}