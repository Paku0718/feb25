class Laptop2 {
	int ram;
	static String name= "hp";
	double price;
	
	Laptop2(){
		ram = 8;
		price = 50000.0;
		//System.out.println("in laptop constr.");
	}
	
	Laptop2(int a, double d){
		ram = a;
		price = d;
		//System.out.println("in laptop 3 para constr.");
	}


	
/*
	void accessCamera(){
		System.out.println(" in accessCamera()");
	}
	
	void accessCamera(String name){
		System.out.println(name + " in accessCamera()");
	}

	void accessCamera(String name){
		return name + "accessCamera()" + p;		
	}

	String display(){
		//System.out.println(" inside display");
		return "Details of Laptop : " + ram + " " + name + " " + price;
		
	}
*/

}

class LaptopDemo2{
	public static void main(String args[]){
		
		Laptop2 laptopObj = new Laptop2(); //heap

		Laptop2 laptopObj1 = new Laptop2(16, 6000.0);
		
		Laptop2 laptopObj2 = new Laptop2(16, 6000.0);

	

		System.out.println(laptopObj.name);
		System.out.println(laptopObj1.name);
		System.out.println(laptopObj2.name);
	
		Laptop2.name = "Dell";
		System.out.println(laptopObj.name);
		System.out.println(laptopObj1.name);
		System.out.println(laptopObj2.name);
		
	}
}