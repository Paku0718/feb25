//constructor (5 me se 3 variables ko initialise kro )

class P {
	int a,b,c,d,e;
	
	P(int a,int b,int c){
		this.a =a;
		this.b=b;
		this.c=c;
	}
}

public class b{
	public static void main(String args[]){
		P obj = new P(10,20,30,40);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	
	}
}

