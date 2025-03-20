package Day14;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//LinkedList<Integer> l1 = new LinkedList<Integer>();	//Type safe
		List<Integer> l1 = new LinkedList<Integer>();//upcasting
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		l1.addFirst(5);
		l1.addLast(57);
		System.out.println(l1);

	}

}
