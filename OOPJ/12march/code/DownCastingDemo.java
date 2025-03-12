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
class C extends B{
	void show(){
		System.out.println("Downcasting : Samzha");
	}
}

class DownCastingDemo{
	public static void main(String args[]){
		A a1 = new A();
		B b1 = new B();
		A a2 = new B(); // Upcasting : Polymorphism
		B b2 = (B) a2;//Downcasting
		//B a2 = new A(); // Not Correct to declare downcasting
		b2.show();
		C c1 = (C) b1;
		c1.show();
	}
}