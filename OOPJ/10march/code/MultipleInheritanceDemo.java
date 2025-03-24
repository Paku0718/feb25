interface A{
	default void msg(){
		System.out.println("A: Method of interfaces A");
	}
}
interface B{
	default void msg(){
		System.out.println("B: Method of interfaces B");
	}
}

class C implements A,B{
	
}

class MultipleInheritanceDemo{
	public static void main(String args[]){
		c c1 = new C();
		c1.msg();
		c1.msg();
		c1.msg();
	}
}