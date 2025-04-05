class BT{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data= d;
			left=right=null;
		}
	}
	
	BT(){
		root=null;
	}
	BT(int d){
		root = new Node(d);
	}
	
	
	
	public static void main(String args[]){
		BT t1 = new BT();
		t1.root = new Node(20);
		t1.root.left = new Node(34);
		t1.root.right = new Node(56);
		t1.root.left.left = new Node(15);
		t1.root.left.right = new Node(34);
		t1.root.right.left = new Node(23);
		t1.root.left.right = new Node(34);
	}
}