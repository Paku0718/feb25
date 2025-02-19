class IncreDecreDemo {
	public static void main(String args[]){
		int a=10;
		
/*
		System.out.println(a);   //10
		System.out.println(++a); //11 pre-inc
		System.out.println(a++); //11 post-incre -12
		System.out.println(--a); //11 pre-decre
		System.out.println(a--); //11 post-decre - 10
		System.out.println(a);   //10
*/
		int b=20;
		int c = b++ + --b + a++ - a++;
		System.out.println(c);
	}
}