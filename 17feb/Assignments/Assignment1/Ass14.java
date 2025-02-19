class Ass14 {
	public static void main(String args[]){
		int n = 10, firstval = 0, secondval = 1;
		
		System.out.print(firstval + " " + secondval);

		for(int i=3; i<=n; i++){
			int nextval = firstval + secondval;
			System.out.print(" " + nextval);
			firstval = secondval;
			secondval = nextval;
		}

	}
}