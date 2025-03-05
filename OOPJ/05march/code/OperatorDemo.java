class OperatorDemo{
	public static void main(String args[]){
		int a=10;
		int b=4;
		//bitwise
		int m=5, n=3;
		
	System.out.println(~m);
	
		//bitwise shifting
		int num =5;// binary 0000 0101
		int result = num << 2; // Leftside by 2 //0001 0100
		System.out.println(num);
		System.out.println(result);
		
		int num1 =20; //binary 00010100
		int result1 = num1 >> 2; // rightside by 2 //00000101
		System.out.println(num1);
		System.out.println(result1);
	
		int num2 =-20; //binary convert 00010100 to 2s comp is 11101011 + 00000001 = 11101100(-20)
		int result2 = num2 >> 2; // rightside by 2 // 11111011
		System.out.println(num2);
		System.out.println(result2);
	
	}
}
