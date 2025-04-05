package Day3;

public class ArrayDemo {
	static int a1[] = new int[15];
	static int n =0;
	
	//display
	static void display() {
		for(int i=0; i<n; i++) {
			System.out.print(a1[i]+ " ");
		}
	}
	
	//Insertion method:
	static void insert(int value) {
		if(n < a1.length) {
			a1[n] = value;
			n++;
		}else {
			System.out.print("Array is full!");
		}
	}
	//find key
	static boolean find(int key) {
		for(int i=0; i<n; i++) {
			if(a1[i]==key) {
				return true;
			}
		}
		return false;
	}
	
	//delete operation
	static void delete(int key) {
		int i;
		for(i=0; i<n; i++) {
			if(a1[i]==key) {
				break;//found: exit the loop
			}
		}
		if(i==n) {
			System.out.println("Element does not exist");
			return;
		}
		//shifting elements
		for(int k=i; k<n; k++) {
			a1[k] = a1[k+1];
		}
		n--;
		
	}
	
	
	public static void main(String args[]) {
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		//insert(60);
		System.err.println("\n-----------------------------------");
		display();
		System.err.println("\n-----------------------------------");
		int key =40;
		if(find(key)) {
			System.out.println("Element found " + key);
		}else {
			System.out.println("Element not found" + key);
		}
		System.err.println("\n-----------------------------------");
		delete(key);
		display();
	}
}
