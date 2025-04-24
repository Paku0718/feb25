class ThirdLargest{
	public static void main(String args[]){
		int arr[]= {10, 25, 47, 85, 12};
		int largest =-1;
		int secondLargest = -1;
		int thirdLargest = -1;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]>secondLargest && arr[i]!=largest){
				secondLargest = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=largest){
				thirdLargest = arr[i];
			}
		}
		System.out.println(thirdLargest);
	}
}