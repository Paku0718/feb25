class HashCode{
	String name;
	int id;
	
	HashCodeDemo(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode(){
		return id;
	}
	
	public static void main(String args[]){
		HashCodeDemo t1 = new HashCodeDemo("Paras",111);
		System.out.println(t1.hashCode());
	}
}