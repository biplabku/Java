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
	
	public int successor(Node x){
		Node cur = root;
		Node parent = cur;
		while(cur.data != x.data){
			parent = cur;
			if(x.data < cur.data){
				cur = cur.left;
			}
			else{
				cur = cur.right;
			}
		}
		if(cur.right != null ){
			Node n = cur.right;
			while(n.left != null && n.data > x.data){
				n = n.left;
			}
			return n.data;
		}
		return parent.data;
	}
	
	public int deleteNode(int val){
		Node cur = root;
		Node parent = null;
		while(cur != null ){
			parent = cur;
			if(val < cur.data && val != cur.data){
				cur = cur.left;
			}
			else{
				cur = cur.right;
			}
		}
		cur = root;
		Node suc = null;
		while(cur != null && cur.data != val){
			suc  = cur;
		}
		suc.left = null;
		suc.right =  null;
		return val;
	}
	
	
	public int totalelements(){
		return nelms;
	}
	
	public static void main(String[] args){
		tre btr = new tre();
		btr.insertelement(15);
		btr.insertelement(6);
		btr.insertelement(18);
		btr.insertelement(3);
		btr.insertelement(7);
		btr.insertelement(17);
		btr.insertelement(20);
		btr.insertelement(2);
		btr.insertelement(4);
		btr.insertelement(13);
		btr.insertelement(9);
		
		Node x = new Node(9);
		//System.out.println(btr.totalelements());
		//btr.display();
		System.out.println("Sucessor " + btr.successor(x));
		System.out.println("deleted element is  " + btr.deleteNode(x.data));
		btr.display();
	}
}
