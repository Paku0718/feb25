// pass by reference
class Example{
	void modify(Wrapper w){
		w.num=20;// val update
		System.out.println(w.num);//20
	}
}

class Wrapper{
	int num;
	Wrapper(int num){
		this.num = num;
	}
}

class ExampleDemo2{
	public static void main(String args[]){
		Wrapper w = new Wrapper(10);
		Example e = new Example();
		e.modify(w);//20
		System.out.println(w.num);
		w.num =34;
		System.out.println(w.num);
		System.out.println(e.SIZE);
		
	}
}