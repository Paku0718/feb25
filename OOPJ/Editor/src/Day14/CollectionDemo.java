package Day14;

import java.util.ArrayList;

class Employee{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString(){
		return empId + " " + empName;
	}
		
}


public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee(11,"Paras"));
		a.add(new Employee(21,"Paras1"));
		a.add(new Employee(31,"Paras2"));
		a.add(new Employee(41,"Paras3"));
		a.add(new Employee(51,"Paras4"));
		a.add(new Employee(61,"Paras5"));
		a.add(new Employee(71,"Paras6"));
		
		System.out.println(a);
		for(Employee x:a) {
			System.out.println(x);
		}
		
	}

}
