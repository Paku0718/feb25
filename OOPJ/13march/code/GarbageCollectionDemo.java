class Employee{
	String name;
	Employee(String name){
		this.name = name;
	}
	
}
class GarbageCollectionDemo{
	protected void finalize(){//overriding of method
		System.out.println("Finalize method called...");
	}
	public static void main(String args[]){
		GarbageCollectionDemo g1 = new GarbageCollectionDemo();
		Employee g1 = new Employee("Java");
			
		g1=null;
		
		System.gc();//Request d
		Runtime.getRuntime().gc();
	}
}