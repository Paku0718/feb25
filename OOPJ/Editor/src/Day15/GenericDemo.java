package Day15;

public class GenericDemo {

	static <T>void display(T element){
		System.out.println(element.getClass().getName() + " " + element);
	}
	
	public static void main(String[] args) {
		
		display(11);
		display(11.45);
		display("Bharat mata ki jai");
	}

}
