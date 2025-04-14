class LinkedListDelete{
	Node start;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
		
		//insert from start
		void insert(int new_data){
			Node new_node = new Node(new_data);
			new_node.next = start;
			start = new_node;
		}
		
		//insert in between
		void insertAfter(Node prev_node, int new_data){
			Node new_node = new Node(new_data);
			new_node.next = prev_node.next ;
			prev_node.next = new_node;
		}
		
		//insert at the end
		void insertAtend(int new_data){
			Node new_node = new Node(new_data);
			if(start==null){
				start = new Node(new_data);
				return;
			}
			Node n = start;
			while(n.next!=null){
				n = n.next;
			}
			n.next = new_node;
			return;
		}
		//deletion at first, between and end by value
		void deleteNode(){
			Node temp = start;
			Node prev=null;
			
			if(temp != null && temp.data ==key){
				head = temp.next;
				return;
			}
			while(temp!=null && temp.data!=key){
				prev =temp;
				temp = temp.next;
			}
			if(temp==null)
				return;
			prev.next = temp.next;
		}
		
	
		
		
		void display(){
			Node n = start;
			while(n!=null){
				System.out.print(n.data + "-->");
				n = n.next;
			}
			
		}
		
		public static void main(String args[]){
			LinkedListDelete l1 = new LinkedListDelete();
			l1.insert(10);
			l1.insert(20);
			l1.insert(30);
			l1.insert(40);
			l1.insert(50);
			l1.insert(60);
			l1.insert(70);
			System.out.println("---------insert at beginning----------");
			l1.display();
			System.out.println("\n---------insert in between----------");
			l1.insertAfter(l1.start.next, 600);
			l1.display();
			System.out.println("\n---------insert at the end----------");
			l1.insertAtend(5);
			l1.display();
		}
}