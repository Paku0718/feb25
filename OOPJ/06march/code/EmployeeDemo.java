class  Employee{
	//Instance variable
	int empId;
	String empName;
	
	void set(int id, String name){
			empId = id;
			empName = name;
		}
		
		void show(){
			System.out.println(empId + " " + empName);
		}
}

class  EmployeeDemo{
	public static void main(String args[]){
		Employee e1 = new Employee();
		e1.set(111, "Paras");
		e1.show();
		
		Employee e2 = new Employee();
		e2.set(222, "kunal");
		e2.show();
	}
}