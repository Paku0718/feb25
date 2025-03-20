package Day14;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<Integer, String>();
		
		m.put(101, "Paras");
		m.put(5, "Kunal");
		m.put(3, "Bapi");
		m.put(52, "Bapi");
		m.put(3, "Bapi");//not allowed
		m.put(14, "Om");
		m.put(6, "Jadoo");
		m.put(5, "");
		m.put(6, "");
		m.put(7, "");
		//m.put(, "");//error
		System.out.println(m);

		//System.out.println(m.get(4));
		//m.remove(3);
		//System.out.println(m);
		
	}

}
