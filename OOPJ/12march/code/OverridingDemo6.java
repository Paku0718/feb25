class Parent{
	int i =100;
	void show(){
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	int num=50;
	int i=40;
	void show(){
		super.show();
		System.out.println("Child method");
	}
	void display(){
		System.out.println(num);
		System.out.println(i);
		System.out.println(super.i);
	}
	
}

class OverridingDemo6{
	public static void main(String args[]){
		Parent p = new Parent();
		p.show();
		
		Child c = new Child();
		c.show();
		c.display();
	}
}