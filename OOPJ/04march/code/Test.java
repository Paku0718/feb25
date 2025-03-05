class Test{
	public static void main(String args[]){
		//float f = 123.45;
		double d = 123.456;
		double d1 = 1.2e3; // valid (1.2 *1000 = 1200.0)
		
		//char ch = 0xBEFA;
		//char ch = 'ubeaf';
		//char ch = -10;//error
		//char ch = '\x';//error
		//char ch = 'a';
		char ch1 = "a";// Error : incopatible type- string cannot be converted to char
		
		
		System.out.println(ch1);
	}
}