class Example{
	int num;

	void display(){
		System.out.println("Number= " + num);
	}
}

class ExampleDemo{
	public static void main(String args[]){
		Example e1 = new Example();
		e1.display();
		System.out.println(e1.SIZE);
	}
}
