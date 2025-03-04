class DataDemo{
	public static void main(String args[]){
		byte b = 130;//error
		byte b = 123.45;//error
		byte b = true;//error
		byte b = "Paras";//error
		
		short s = 22767;
		short s = -32768;
		short s = 123.45;
		System.out.println(s);
	}
}