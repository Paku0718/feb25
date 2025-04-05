//using linkedlist
 class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
	
}

class StackDemo4{
	
	
	
	Node head;
	
	StackDemo4(){
		this.head = null;
	}
	
	boolean IsEmpty(){
		return head == null;
	}
	
	static void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	static void pop(){
		if(IsEmpty()){
			System.out.println("Stack underflow!!!");
			return;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		temp = null;
	}
	
	int peek(){
		if(!IsEmpty()){
			return head.data;
		}else{
			System.out.println("Stack underflow!!!");
			return -1;
		}
	}
	
	static void reverse(StringBuffer str){
		int n = str.length();
		Stack4 s1 = new Stack4(n);
		
		for(int i=0; i<n; i++){
			push(str.charAt(i));
		}
		for(int i=0; i<n; i++){
			char ch = s1.pop();
			str.setCharAt(i,ch);
		}
	}
	
	public static void main(String args[]){
		StaticDemo4 s1 = new StaticDemo4();
		StringBuffer s = new StringBuffer("CDAC Mumbai");
		reverse(s);
		System.out.println("Reverse is" + s);
		
	}
}