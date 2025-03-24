package Day15;

interface Hello{
	void sayHello();
}
public class AnonymousClass {

	public static void main(String[] args) {
		Hello h1 = new Hello() {
			public void sayHello() { //anonymous call of interface
				System.out.println("Hello world!");
			}
		};
		//call for method
		h1.sayHello();

	}

}
