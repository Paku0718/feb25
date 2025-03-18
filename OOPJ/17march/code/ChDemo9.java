class A{
	void m1() throws Exception{
	}
}
class B extends A{
	void m1() throws Exception, FileNotFoundException, ArrayIndexOutOfBoundsException{
	}
}
class ChDemo{
	public static void main(String args[]){
		A a = new A();
		a.m1();
	}
}