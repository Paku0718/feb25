package Day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Demo1{
	private String message = "Learning Reflection";
	
	public Demo1() {
		System.out.println("Demo:: Constructor");
	}
	
	public void display() {
		System.out.println("Demo:: Method");
	}
}

public class ReflectionDemo1 {

	public static void main(String[] args) {
		//Class reflection
		Class<?> d1 = Demo1.class;
		System.out.println(d1.getName());
		
		//construction reflection
		Constructor<?>[] c1 = d1.getConstructors();
		System.out.println("Constructor----------");
		for(Constructor<?> constructor : c1 ) {
			System.out.println(constructor);
		}
		//Method
		Method[] m1 = d1.getDeclaredMethods();
		System.out.println("Methods--------------");
		for(Method method: m1){
			System.out.println(method);
		}
		
		//Fields
		Field[] f1 = d1.getDeclaredFields();
		System.out.println("Fields----------------");
		for(Field field : f1 ) {
			System.out.println(field);
		}
	}

}
