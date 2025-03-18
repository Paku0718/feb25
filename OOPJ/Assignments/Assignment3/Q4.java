class Q4{
	public static void main(String args[]){
		int arr[] = {2,3,4,5,6,7,8,9,10,12};
		countEven(arr);
	}
	
	public static void countEven(int array[]){
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<array.length;i++){
			if(array[i]%2==0){
				evenCount++;
			}
		}
		
		System.out.println("Number of even elements: " + evenCount);
	}
}