class A{}
class B extends A{}

class ExceptionDemo3{
	public static void main(String args[]){
		System.out.println("Started");
		A a = new A();
		B b = (B)a;
		
		System.out.println("Finished");
	}
}