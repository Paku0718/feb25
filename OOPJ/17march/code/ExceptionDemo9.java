class ExceptionDemo9{
	public static void main(String args[]){
		System.out.println("Start");
		String ar[] = {"15", "s"};
		
		String s1 = ar[0];
		String s2 = ar[1];
			
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		
		try{
			int k = i/j;
			Systemm.out.println(k);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception");
		}finally{
			System.out.println("Release the resourses");
		}	
		System.out.println("Finished");
	}
}