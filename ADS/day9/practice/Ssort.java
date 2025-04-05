class Ssort{
	void ssort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			int min = i;
			for(int j=i+1;j<n;j++){
				if(arr[j] < arr[min])
					min = j;
		
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {99,44,77,22,88,33,11,66,55};
		Ssort s1 = new Ssort();
		
		s1.display(arr);
		System.out.println();
		s1.ssort(arr);
		s1.display(arr);
		
	
	}
}