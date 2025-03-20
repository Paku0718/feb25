package Day14;


import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<Integer, String>();
		
		m.put(101, "Paras");
		m.put(5, "Kunal");
		m.put(3, "Bapi");
		m.put(52, "Bapi");
		m.put(14, "Om");
		m.put(6, "Jadoo");
		m.put(7, "");
		m.put(8, "");
		m.put(9, "");

		System.out.println(m);


		
	}

}
