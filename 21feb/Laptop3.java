class Laptop3{
	int ram =2;
	static String name = "HP";
	double price = 20000.0;

	{
		ram = 8;
		name = "Dell";
		price = 30000.0;
		//System.out.println("Inside Init Block");
	}
	static{
		//ram = 16;
		name = "Hp";
		//price = 40000.0;
		//System.out.println("Inside static Block");
	}
	Laptop3(){
		//System.out.println("Inside constr.");
	}

}

class LaptopDemo3{
	public static void main(String args[]){
		Laptop3 obj1 = new Laptop3();
		Laptop3 obj2 = new Laptop3();

		System.out.println(obj1.ram);
		System.out.println(obj1.name);
		System.out.println(obj1.price);
	}
}