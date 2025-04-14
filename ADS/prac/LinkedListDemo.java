class LinkedListDemo{
	Node start;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	void display(){
		Node n = start;
		while(n!=null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		LinkedListDemo l1 = new LinkedListDemo();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(20);
		Node fourth = new Node(30);
		
		l1.start.next =second;
		second.next = third;
		third.next = fourth;
		l1.display();
		
	}
}