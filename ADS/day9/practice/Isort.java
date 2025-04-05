class Isort{
	void isort(int arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			int key = arr[i];//element to be shifted
			int j=i-1;
			
			//shifting elements
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
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
		Isort i1 = new Isort();
		
		i1.display(arr);
		System.out.println();
		i1.isort(arr);
		i1.display(arr);
	
	}
}