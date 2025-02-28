class Laptop {
	int ram;
	String name;
	double price;
	
	void accessCamera(){
		System.out.println(" in accessCamera()");
	}
	
	String display(){
		//System.out.println(" inside display");
		return "Details of Laptop : " + "ram" + " " + name + " " + price;
		
	}

}

class LaptopDemo{
	public static void main(String args[]){
		int a=10;
		Laptop laptopObj = new Laptop();

		//System.out.println(laptopObj.ram);
		//System.out.println(laptopObj.name);
		//System.out.println(laptopObj.price);
		//laptopObj.accessCamera();
		
		//String s = laptopObj.display();
		//System.out.println(s);

		//laptopObj.display();
			
	}
}