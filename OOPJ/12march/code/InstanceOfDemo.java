class A{
	
}

class B extends A{
	
}

class InstanceOfDemo{
	public static void main(String args[]){
		InstanceOfDemo op1 = new InstanceOfDemo();
		A a1 = new A();
		B b1 = new B();
		//syntax:<objectname> instanceof <classname>
		//op1  instanceof InstanceOfDemo
		
		System.out.println(op1 instanceof InstanceOfDemo);//true
		System.out.println(b1 instanceof A);//true
		//System.out.println(b1 instanceof B);//error
		System.out.println(a1 instanceof B);
		//System.out.println(b1 instance A);
	}
}