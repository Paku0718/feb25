class ExceptionDemo2{
	public static void main(String args[]){
		int result=0;
		try{
			int a=100;
			result = a/0;
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println(result);
	}
}