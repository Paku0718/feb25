class Parent{
	Parent(String name){
		System.out.println("Parent Constructor: " + name);
	}
}
class Child extends Parent{
	Child(String name){
		//super(name);
		System.out.println("Child constructor: " + name );
	}
}

class OverridingDemo8{
	public static void main(String args[]){
		//Child c1 = new Child();
		Child c = new Child("OOps");
	}
}