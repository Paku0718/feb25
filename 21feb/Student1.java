class Student1{
	int id;
	String name;
	long mobNo;
	static String course = "PG-DAC";

	Student1(){
		id=0;
		name="XYZ";
		mobNo=01;
	}

	Student1(int id, String name, long mobNo){
		//id = id;
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
	}

	void display(int id){
		System.out.println(this.id + " " + course + " " + id);
	}

	Student1 getStudent(){
		return this;
	}

	public static void main(String args[]){
		Student1 s = new Student1();
		Student1 s1 = new Student1(2,"a",91);
		Student1 s2 = new Student1(3,"a",91155151);		

		//s.display();
		//s1.display();
		//s2.display();

	/*
		s2.display(100);
		s1.display(10000);
		s1.display(50);
	*/
		
		Student1 s3 = s2.getStudent();
		s3.display();

		System.out.println(s2);
		System.out.println(s3);
			
	}

}