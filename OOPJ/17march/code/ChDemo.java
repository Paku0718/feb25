class ChDemo{
	public static void main(String args[]){
		int i = Integer.parseInt("ab");
		try{
			int j = System.in.read();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}