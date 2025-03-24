class Employee{
	float salary = 800000;
}

class Programmer extends Employee{
	int bonus = 10000;
}

class SingleInheritanceDemo{
	public static void main(String args[]){
		Employee e = new Programmer();
		System.out.println(e.salary);
		System.out.println(e.bonus);
		
		
		Programmer e1 = new Programmer();
		System.out.println(e1.salary);
		System.out.println(e1.bonus);
	}
}