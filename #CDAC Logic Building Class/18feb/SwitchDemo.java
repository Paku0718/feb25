class SwitchDemo {
	public static void main(String args[]){
		int a = 20, c=40;
		
/*
		switch(a){
			case 10+10:
				System.out.println(10);
				break;
			case 5+5:
				System.out.println(20);
				break;
			case 30:
				System.out.println(30);
				break;
			default:
				System.out.println("Default Case");
				break;
		}

	*/
	String b = "Paras";
	switch(b){
		default:
			System.out.println("default");
			break;
		case "Paras":
			System.out.println(10);
			break;
		case "c":
			System.out.println(20);
			break;
		case "10":
			System.out.println(30);
			break;
		}
		System.out.println("Outside Switch");
	}
}