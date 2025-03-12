//Nesting of interfaces

interface OuterInterface1{
	void print();
	
	interface InterInterface2{
		void scan();
	}
}

class TestInterface implements OuterInterface1.InnerInterface2{
	public void print(){
		System.out.println("Outer Interface");
	}
}

class MultipleInheritanceDemo4{
	public static void main(String args[]){
		TestInterface t1 = new TestInterface();
		t1.scan();
	}
}