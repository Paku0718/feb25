class A{
	int cube(final int n){
		//n=n+2;//Error:CTE
		return n*n*n;
	}
}

class FinalDemo7{
	public static void main(String args[]){
		A a1 = new A();
		System.out.println(a1.cube(5));
	}
}