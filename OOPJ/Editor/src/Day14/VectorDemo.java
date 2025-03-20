package Day14;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<String> a11 = new Vector<String>();
		a11.add("Paras");
		a11.add("Kunal");
		a11.add("Bapi");
		a11.add("Jod");
		a11.add("god");
		a11.add("Jadoo");
		System.out.println(a11);
		
		a11.remove(0);
		System.out.println(a11);

	}

}
