class ArrayDemo10{
	static void printArray(int[] arr){
		for(int num:arr){
			System.out.println(num);
		}
	}
	
	public static void main(String args[]){
		int[] arr = {1,2,3,4,5};
		printArray(arr);
	}
}