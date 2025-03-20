package Day14;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1, "Paras");
		m.put(2, "Kunal");
		m.put(3, "Bapi");
		m.put(4, "Bapi");
		m.put(4, "Bapi");//not allowed
		m.put(5, "Om");
		m.put(5, "Jadoo");
		m.put(5, "");
		//m.put(, "");//error
		System.out.println(m);

		System.out.println(m.get(1));
		m.remove(3);
		System.out.println(m);
		
	}

}
