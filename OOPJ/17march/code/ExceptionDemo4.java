// working in java 23 version but not in java 8 (null pointer exception does not occur in java 23 in this prog but in java 8)
/*class ExceptionDemo4{
	
	static void m1(){
		System.out.println("M1 :: Started");
	}
	

	public static void main(String args[]){
		System.out.println("Started");
		
		ExceptionDemo4 a= null;
		a.m1();
		
		System.out.println("Finished");
	}
}
*/

class ExceptionDemo4{
	
	static void m1(){
		System.out.println("M1 :: Started");
	}
	

	public static void main(String args[]){
		System.out.println("Started");
		
		ExceptionDemo4 a= null;
		try{
			a.m1();//Exception e : NPE
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Null ko invoke mat karo");
		}
		System.out.println("Finished");
		System.out.println("Finished");
	}
}