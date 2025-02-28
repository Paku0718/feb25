class Laptop1 {
	int ram;
	String name;
	double price;
	
	Laptop1(){
		ram = 8;
		name = "HP";
		price = 50000.0;
		//System.out.println("in laptop constr.");
	}
	
	Laptop1(int a, String s, double d){
		ram = a;
		name = s;
		price = d;
		//System.out.println("in laptop 3 para constr.");
	}

	Laptop1(String s){
		name = s;
	}

	

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

}

class LaptopDemo1{
	public static void main(String args[]){
		int a=10;
		//Laptop1 laptopObj = new Laptop1(); //heap

		Laptop1 laptopObj1 = new Laptop1(16, "Dell", 6000.0);
		
		//Laptop1 laptopObj2 = new Laptop1("Asus");

		//laptopObj2.ram = 32;
		//laptopObj2.price = 10000.0;

		//System.out.println(laptopObj.display());
		//System.out.println(laptopObj1.display());
		//System.out.println(laptopObj2.display());
	
	laptopObj1.accessCamera();
	laptopObj1.accessCamera("HP");
	System.out.println(laptopObj1.accessCamera("HP",10.0));
	System.out.println(laptopObj1.accessCamera(100000.0,"dell"));
		
	}
}