class BT2222{
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data= d;
			left=right=null;
		}
	}
	
	BT2222(){
		root=null;
	}
	BT2222(int d){
		root = new Node(d);
	}
	
	//insertion bst
	Node insertdata(Node root, int key){
		if(root  == null){
			root = new Node(key);
			return root;
		}
		if(key <= root.data){
			root.left = insertdata(root.left,key);
		}else {
			root.right = insertdata(root.right,key);
		}
		return root;
	}
	
	//deletion bst
	Node deleteNode(Node root, int key){
		if(root == null)
			return root;
		
		if(key<root.data)
			root.left= deleteNode(root.left,key);
		else if(key> root.data)
			root.right = deleteNode(root.right,key);
		else{
			//case 1:leaf node delete
			//case 2: single child delete
			if(root.left == null)
				return root.right;
			if(root.right == null)
				return root.left;
			//case 3: two children deletion
			root.data = minvalue(root.right);
			root.right = deleteNode(root.right, root.data);
		}
		return root;
	}
	
	int minvalue(Node root){
		int x = root.data;
		while(root.left != null){
			x =root.left.data;
			root = root.left;
		}
		return x;
	}
	
	void delete(int key){
		root = deleteNode(root, key);
	}
	
	//Preorder:Root,LC,RC
	void preorder(Node n){
		if(n == null)
			return;
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	//Inorder: LC,Root,RC
	void inorder(Node n){
		if(n == null)
			return;
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
	}
	
	//Postorder: LC,Root,RC
	void postorder(Node n){
		if(n == null)
			return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data + " ");
	}
	
	public static void main(String args[]){
		BT2222 t1 = new BT2222();
		t1.insert(20);
		t1.insert(34);
		t1.insert(56);
		t1.insert(15);
		t1.insert(34);
		t1.insert(23);
		t1.insert(34);
		t1.insert(55);
		t1.insert(74);
		t1.insert(93);
		t1.insert(2);
		
		//inorder: LC, Root
		System.out.println("------ inorder------");
		t1.inorder(t1.root);
		
		//case1: leaf node
		t1.delete(2);
		System.out.println("-----delete leaf node-------");
		t1.inorder(t1.root);
		
	}
}