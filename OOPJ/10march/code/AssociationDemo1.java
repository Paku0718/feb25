class Address{
	String city, state, country;
	
	Address(String city, String state, String country){
		this.city = city;
		this.state = state;
		this.countery = country;
	}
}
class Employee{
	int id;
	String name;
	Address a;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display(){
		System.out.println();
	}
}

class AssociationDemo1{
	public static void main(String args[]){
		Teacher t1 = new Teacher("Vipul sir");
		Student s1 = new Student("Paras");
		Student s2 = new Student("Kunal");
		System.out.println(t1.name + " " + s1.name + " " + s2.name);
	}
}