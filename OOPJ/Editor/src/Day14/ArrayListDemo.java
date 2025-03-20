package Day14;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();//non type safe
		ArrayList<String> a11 = new ArrayList<>();
		a11.add("Paras");
		a11.add("Kunal");
		a11.add("Bapi");
		a11.add("Jod");
		a11.add("god");
		a11.add("Jadoo");
		
		System.out.println(a11);
		System.out.println(a11.get(0));
		System.out.println(a11.get(3));
		
		a11.remove(0);
		System.out.println(a11);
	}

}
