package Day14;

import java.util.TreeSet;

class Employee3 {
	private int empId;
	private String empName;
	
	public Employee3(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString(){
		return empId + " :=> " + empName;
	}
	
	
	@Override
	public int compareTo(Employee3 o) {
		return empId -o.empId;
	}
}


public class CollectionDemo3 {

	public static void main(String[] args) {
		TreeSet<Employee3> a = new TreeSet<Employee3>();
		a.add(new Employee3(11,"Paras"));
		a.add(new Employee3(21,"Paras1"));
		a.add(new Employee3(31,"Paras2"));
		a.add(new Employee3(41,"Paras3"));
		a.add(new Employee3(51,"Paras4"));
		a.add(new Employee3(61,"Paras5"));
		a.add(new Employee3(71,"Paras6"));
		
		System.out.println(a);
		for(Employee3 x: a) {
			System.out.println(x);
		}
		
	}

}
