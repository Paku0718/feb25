class Teacher{
	String name;
	
	Teacher(String name){
		this.name= name;
	}
}

class Student{
	String name;
	
	Student(String name){
		this.name = name;
	}
	
}

class AssociationDemo{
	public static void main(String args[]){
		Teacher t1 = new Teacher("Vipul sir");
		Student s1 = new Student("Paras");
		Student s2 = new Student("Kunal");
		System.out.println(t1.name + " " + s1.name + " " + s2.name);
	}
}