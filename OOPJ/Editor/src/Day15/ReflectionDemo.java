package Day15;

import java.lang.reflect.Constructor;

class Demo{
	private String message = "Learning Reflection";
	
	public Demo() {
		System.out.println("Demo:: Constructor");
	}
	
	public void display() {
		System.out.println("Demo:: Method");
	}
}

public class ReflectionDemo {

	public static void main(String[] args) {
		Class<?> d1 = Demo.class;
		
		System.out.println(d1.getName());
		
		Constructor<?>[] c1 = d1.getConstructors();
		System.out.println("Constructor");
		for(Constructor<?> constructor : c1 ) {
			System.out.println(constructor);
		}
	}

}
