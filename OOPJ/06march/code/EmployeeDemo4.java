//use of static
//static does not needed reference object to call just write class.variableName

class  Employee{
	static int a=100;
	static int b=200;
	
	static add(){
		System.out.println("Hello");
	}
}

class  EmployeeDemo4{
	
	static int x =10;
	static int y =20;
	int z=30;
	
	public static void main(String args[]){
		System.out.println(x);
		System.out.println(y);
		System.out.println(Employee.a);
		System.out.println(Employee.b);
		
		Employee.add()//employee class static method call
		add()//static method of same class
		
	}
}