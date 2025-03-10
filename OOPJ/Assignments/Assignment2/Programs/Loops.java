class Loops{
	void show(){
		System.out.println("In Show()");
	}
	
	void showOne(){
		System.out.println("In ShowOne()");
		show();
	}
	public static void main(String args[]){
		Loops obj = new Loops();
		obj.showOne();
	}
	
}