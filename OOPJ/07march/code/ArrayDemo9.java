class Student{
	String  name;
	int id;
	
	Student(String n, int id){
		this.name = n;	
		this.id = id;
	}
	
}

class ArrayDemo9{
	public static void main(String args[]){
		Student[] s1 = new Student[3];
		s1[0] = new Student("Shankar",123);
		s1[1] = new Student("Paras",124);
		s1[2] = new Student("Kunal",125);
		
		for(Student s: s1){
			System.out.println(s.name + " " +s.id);
		}
		
	}
}