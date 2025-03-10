class Employee{
	int i;
	String name;
	int age;
	
	Employee(){
		//this(100,"sita",25);
		System.out.println(i+name);
	}
	Employee(int i, String name){
		
		this.i = i;
		this.name = name;
		this();
		System.out.println(i+name);
	}
	Employee(int i, String name, int age){
		this(11,"bapu");
		this.i = i;
		this.name = name;
		this.age =age;
		System.out.println(i+name+age);
	}
	Employee(int i, int age, String name){
		this();
		this.i = i;
		this.name = name;
		this.age =age;
		System.out.println(i+name+age);
	}
	
}

class EmployeeDemo9{
	public static void main(String args[]){
		
		Employee e = new Employee();
		Employee e3 = new Employee(2,"Kunal");
		Employee e1 = new Employee(1,24,"Paras");
		Employee e2 = new Employee(1,"jod",32);
		
		
		
		
	}
}