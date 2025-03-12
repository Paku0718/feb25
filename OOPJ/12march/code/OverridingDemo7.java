class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child const");
	}
}

class OverridingDemo7{
	public static void main(String args[]){
		Child c = new Child();
	}
}