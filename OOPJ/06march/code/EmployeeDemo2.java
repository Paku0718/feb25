class  Employee{
	//Instance variable
	private int empId;
	private String empName;
	private static int total;
	
	void set(int id, String name, int t){
			empId = id;
			empName = name;
			total = t;
		}
		
		void show(){
			System.out.println(empId + " " + empName);
		}
}

class  EmployeeDemo2{
	public static void main(String args[]){
		Employee e1 = new Employee();
		e1.set(111, "Paras", 100);
		e1.show();
		
		Employee e2 = new Employee();
		e2.set(222, "kunal", 45);
		e2.show();
	}
}