
package Day14;

import java.util.TreeSet;

class Employee2 implements Comparable<Employee2> {
	private int empId;
	private String empName;
	
	public Employee2(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString(){
		return empId + " " + empName;
	}
	
	@Override
	public int hashCode() {
		return empId;
	}
	
	@Override
	public int compareTo(Employee2 o) {
		return empId -o.empId;
	}
}


public class CollectionDemo2 {

	public static void main(String[] args) {
		TreeSet<Employee2> a = new TreeSet<Employee2>();
		a.add(new Employee2(11,"Paras"));
		a.add(new Employee2(21,"Paras1"));
		a.add(new Employee2(31,"Paras2"));
		a.add(new Employee2(41,"Paras3"));
		a.add(new Employee2(51,"Paras4"));
		a.add(new Employee2(61,"Paras5"));
		a.add(new Employee2(71,"Paras6"));
		
		System.out.println(a);
		for(Employee2 x: a) {
			System.out.println(x);
		}
		
	}

}
