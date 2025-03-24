class Animal{
	void display(){
		
		System.out.println("Parent class: P1");
	}
}

class Dog extends Animal{
	void childDisplay(){
		System.out.println("Child class: C1"); 	
	}
}

class Babydog extends Dog{
	//int bcid=6;
	void babyDisplay(){
		System.out.println("Babychild class: BC1");
	}
}

class MultilevelInheritancceDemo{
	public static void main(String args[]){
		Babydog b1 = new Babydog();
		b1.babyDisplay();
		b1.childDisplay();
		b1.display();
	}
}