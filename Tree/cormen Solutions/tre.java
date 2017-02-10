package binarysearchtree;

public class tre {
	public Node root;
	public int nelms;
	
	public tre(){
		root = null;
		nelms = 0;
	}
	
	public void display(){
		inorder(root);
	}
	
	public void inorder(Node c){
		if(c != null){
			inorder(c.left);
			System.out.println(c.data);
			inorder(c.right);
		}
	}
	
	public void insertelement(int val){
		Node newnode = new Node(val);
		Node cur = root;
		Node parent = null;
		if(cur == null){
			root = newnode;
		}
		while(cur != null){
			parent = cur;
			if(newnode.data < cur.data){
				cur = cur.left;
			}
			else{
				cur = cur.right;
			}
		}
		if(parent == null){
			root = newnode;
		}
		else if(newnode.data < parent.data){
			parent.left = newnode;
		}
		else{
			parent.right = newnode;
		}
		nelms++;
	}
	
	public int totalelements(){
		return nelms;
	}
	
	public static void main(String[] args){
		tre btr = new tre();
		btr.insertelement(12);
		btr.insertelement(13);
		btr.insertelement(1);
		System.out.println(btr.totalelements());
		btr.display();
	}
}
