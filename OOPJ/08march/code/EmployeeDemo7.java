class Employee{
	int i;
	String name;
	
	Employee(){
		System.out.println(i+name);
	}
	Employee(int i, String name){
		this.i = i;
		this.name = name;
	}
	
}

class EmployeeDemo7{
	public static void main(String args[]){
		// if there is two constructor  
		Employee e1 = new Employee(1,"Paras");
		//Employee e = new Employee();
		
		
		
	}
}