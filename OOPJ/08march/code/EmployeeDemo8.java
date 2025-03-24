class Employee{
	int i;
	String name;
	int age;
	
	Employee(){
		System.out.println(i+name);
	}
	Employee(int i, String name){
		this.i = i;
		this.name = name;
		System.out.println(i+name);
	}
	Employee(int i, String name, int age){
		this.i = i;
		this.name = name;
		this.age =age;
		System.out.println(i+name+age);
	}
	
}

class EmployeeDemo8{
	public static void main(String args[]){
		
		Employee e = new Employee();
		Employee e1 = new Employee(1,"Paras",24);
		Employee e2 = new Employee(1,"jod",32);
		
		
		
		
	}
}