package Day14;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

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
		a11.remove("Bapi");
		System.out.println(a11);
		System.out.println("----------------------");
		
		//Traversing : Method 1
		for(int i=0;i<a11.size();i++) {
			System.out.println(a11.get(i));
		}
		System.out.println("------------");
		//Traversing :Method 2
		for(String x: a11) {
			System.out.println(x);
		}
		System.out.println("------------------");
		//Traversing : Method 3
		Iterator<String> itr = a11.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
	}

}
