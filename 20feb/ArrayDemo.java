class ArrayDemo {
	public static void main(String args[]){
		int [][] arr1 = new int[3][3];
		
		for(int i =0; i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++){
				arr1[i][j]=10;
			}
		System.out.println();
		}
	
		for(int i =0; i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++){
				System.out.print(arr1[i][j] + " ");
			}
		System.out.println();
		}
	
		
	}
}