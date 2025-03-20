package Day14;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		
		m.put(1, "Paras");
		m.put(2, "Kunal");
		m.put(3, "Bapi");
		m.put(4, "Bapi");
		m.put(4, "Bapi");//not allowed
		m.put(5, "Om");
		m.put(5, "Jadoo");
		m.put(5, "");
		m.put(6, "");
		m.put(7, "");
		//m.put(, "");//error
		System.out.println(m);

		System.out.println(m.get(4));
		m.remove(3);
		System.out.println(m);
		
	}

}
