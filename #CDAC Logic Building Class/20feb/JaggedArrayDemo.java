class JaggedArrayDemo {
	public static void main(String args[]){
		int [][] arr1 = new int[3][];
		
		arr1[0] = new int[2];
		arr1[1] = new int[4];
		arr1[2] = new int[3];
		
		//System.out.println(arr1[0][0]);

	/*
		for(int i =0; i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++){
				System.out.print(arr1[i][j] + " ");
			}
		System.out.println();
		}
	*/


	
		for(int i =0; i<3;i++){
			for(int j=0; j<4;j++){
				arr1[i][j]=10;
			}

		}
	
	


	}
}