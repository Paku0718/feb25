class StaticDemo{
	static int x = 10;
	static int y = 20;
	int z=30;
	
	void show(){
		System.out.println(x);
		System.out.println(z);
	}
	static void show1(){
		System.out.println(x);
		//System.out.println(z);//error non static is not available
	}
	
	public static void main(String args[]){
		StaticDemo s1 = new StaticDemo();
		s1.show();
		//show(); //error: Insctance method require reference object
		show1();
	}
}
