class Employee{
	private int id;
	private String name;
	
	//getter method
	public String getName(){
		return name;
	}
	
	//setter method
	public void setName(String name){
		this.name = name;
	}
	
}

class EncapsulationDemo{
	public static void main(String args[]){
		Employee e = new Employee();
		e.setName("Paras");
		System.out.println("Employee name: " + e.getName());
		
	}
	
}