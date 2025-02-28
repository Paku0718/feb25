class NestedForDemo{
	public static void main(String args[]){
	/*
		for(int a=10; a>=5; a--){
			for(int b=10; b>=5; b--){
				System.out.println(a);
			}
		}
	*/
	
	/*
		for(int a=10; a>=5; a--){
			for(int b=10; b>=5; b--){
				System.out.print(b+ " ");
			}
		System.out.println();
		}
	*/

	/*
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(i+ " ");	
			}
		System.out.println();
		}
	*/

	/*
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*" + " ");	
			}
		System.out.println();
		}
	*/
		int count =0;
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print(++count+  " ");	
			}
		System.out.println();
		}








	/*
		int a =10;
		while (a>=5){
			int b=10;
			while (b>=5){
				System.out.println(a);
				b--;
			}
			a--;
		}
	*/


	}
}