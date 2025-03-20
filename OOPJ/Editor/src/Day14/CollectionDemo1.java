package Day14;

import java.util.ArrayList;

class Employee1 {
	private int empId;
	private String empName;
	
	public Employee1(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public int hashCode() {
		
		return empId;
	}
	
	@Override
	public String toString(){
		return empId + " " + empName;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		if(obj instanceof Employee1) {
			Employee1 e = (Employee1) obj;
			return empId == e.empId;
		}
		return false;
	}
}


public class CollectionDemo1 {

	public static void main(String[] args) {
		ArrayList<Employee1> a = new ArrayList<Employee1>();
		a.add(new Employee1(11,"Paras"));
		a.add(new Employee1(21,"Paras1"));
		a.add(new Employee1(31,"Paras2"));
		a.add(new Employee1(41,"Paras3"));
		a.add(new Employee1(51,"Paras4"));
		a.add(new Employee1(61,"Paras5"));
		a.add(new Employee1(71,"Paras6"));
		
		System.out.println(a);
		for(Employee1 x: a) {
			System.out.println(x);
		}
		
	}

}
