class ExceptionDemo5{
	
	static void m1(){
		System.out.println("M1 :: Started");
	}
	

	public static void main(String args[]){
		System.out.println("Started");
		
		ExceptionDemo5 a= null;
		try{
			a.m1();//Exception e : NPE
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Null ko invoke mat karo");
		}finally{
			System.out.println("release resourses");
		}
		System.out.println("Finished");
	}
}