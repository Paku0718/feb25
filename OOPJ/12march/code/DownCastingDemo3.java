class Animal{
	void show(){
		System.out.println("Parent class");
	}
}
class Cat extends Animal{
	void show(){
		System.out.println("Child class");
	}
}

class DownCastingDemo3{
	public static void main(String args[]){
		//case 1
		Animal a = new Cat();//Upcasting
		Cat c= (Cat) a;//Downcasting
		c.show();//child method
		
		//case 2
		//Animal a = new Animal();
		//Cat c = (Cat) a; //DownCasting: Exception
		//c.show()//child method
		
		//case 3
		Animal a2 =new Cat();
		
		if(a2 instanceof Cat){
			Cat c2 = (Cat) a2;
			c2.show();//child method
		}else{
			System.out.println("Downcasting : Not Possible");
		}
	}
}