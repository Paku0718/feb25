
interface Animal{
	void sound();// Abstract method
}

class Dog implements Animal{
	public void sound(){
		System.out.println("Dog Barks: Sound");
	}
}

class InterfaceDemo{
	public static void main(String args[]){	
		Animal a = new Dog();
		a.sound();
	}
}