class LinkedListInsert{
	Node start;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			Node next= null;
		}
	}
	//Insert in the beginning
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = start;
		start = new_node;
	}
	
	//Insert in between
	void insertAfter(Node prev_node, int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	//Insert at the end
	void insertAtend(int new_data){
		Node new_node = new Node(new_data);
		if(start == null){
			start = new Node(new_data);
			return;
		}
		Node n = start;
		while(n.next!=null){
			n= n.next;
		}
		n.next= new_node;
		return;
	}
	
	
	
	void display(){
		Node n = start;
		while(n!=null){
			System.out.print(n.data + "-->");
			n = n.next;
		}
		
	}
	
	public static void main(String args[]){
		LinkedListInsert l1 = new LinkedListInsert();
		l1.insert(30);
		l1.insert(20);
		l1.insert(10);
		l1.insert(5);
		l1.insert(100);
		//l1.insert(200);
		System.out.println("---------insert at beginning----------");
		l1.display();
		System.out.println("\n---------insert at between----------");
		l1.insertAfter(l1.start, 150);
		l1.display();
		//l1.insertAfter(l1.start.next, 60);
		System.out.println("\n---------insert at the end----------");
		l1.insertAtend(250);
		l1.display();
	}
}