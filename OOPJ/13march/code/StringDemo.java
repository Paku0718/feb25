class StringDemo{
	public static void main(String args[]){
		//Method 1 : String literals; constants
		String s1 = "ABC";//string literal
		String s2 = "ABC";
		String s3 = "ABCD";
		String s4 = "ABCD";
		
		System.out.println((s1==s2));//true
		System.out.println((s3==s4));//true
		System.out.println((s1==s3));//false
		
		//Method 2
		String s5 = new String("ABC");
		String s6 = new String ("ABCD");
		System.out.println((s5==s6));//false
		System.out.println((s3==s6));//false
		
		System.out.println((s1.equals(s5)));//true
		System.out.println((s5.equals(s6)));//false
		
		String s7 = new String("ABC");
		System.out.println(s1);
		s1.concat("XYZD");
		System.out.println(s1);
		s1= s1.concat("XYZD");
		s1= s1.concat("XYZD");
		System.out.println(s1);
		s2 = s1.concat("XYZD");
		
	}
}