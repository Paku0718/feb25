class A{
	void show(){
		System.out.println("Parent class");
	}
}
class B extends A{
	void show(){
		System.out.println("Child class");
	}
}

class UpcastingDemo(){
	public static void main(String args[]){
		A a1 = new A();
		B b1 = new B();
		A a2 = new B(); // Upcasting : Polymorphism
	}
}