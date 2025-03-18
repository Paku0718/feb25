class ExceptionDemo3{
	public static void main(String args[]){
		System.out.println("Execution started");
		String s1 = "12";
		String s2 = "0";
		
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		
		try{
			int result = i/j;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println("Execution finished");
	}
}