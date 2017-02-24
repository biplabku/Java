
public class binarytree {
	public Node root;
	public int nelms;
	
	public binarytree(){
		nelms = 0;
		root = null;
	}
	
	public void display(){
		System.out.println(nelms);
		inOrder(root);
	}
	
	public void inOrder(Node c){
		if(c != null){
			inOrder(c.left);
			System.out.println(c.data);
			inOrder(c.right);
		}
	}
	
	public void addNode(int val){
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
				if(cur == null){
					parent.left = newnode;
					return;
				}
			}
			else{
				cur = cur.right;
				if(cur == null){
					parent.right = newnode;
					return;
				}
			}
		}
		nelms++;
	}
	
	// checking for a balanced binary tree
	// that is check both left and right subtree and increment their counter if substraction
	// results in more than 1 then its not balanced and hence the condition fails;
	// so one idea is to let the code run till the end and count the number of levels it goes down.
	public boolean checkTreBalance(){
		int countleft;
		int countright;
		countleft = checkleft(root);
		countright = checkright(root);
		if((countleft - countright) == 1 || (countright - countleft) == 1  || countright == countleft){
			return true;
		}
		return false;
		
	}
	
	public void checkbalance(){
		Node cur = root;
		System.out.println(isBalanced(cur));
	}
	public boolean isBalanced(Node cur){
		int leftheight;
		int righheight;
		if(cur == null){
			return true;
		}
		// height of both left and right subtree of the current node 
		// difference between them should be less than or equal to 1
		leftheight = calcheight(cur.left);
		righheight = calcheight(cur.right);
		int res = leftheight-righheight;
		 
		if(Math.abs(res) <= 1 && isBalanced(cur.left) && isBalanced(cur.right)){
			return true;
		}
		return false;
	}
	
	public int calcheight(Node cur){
		if(cur == null){
			return 0 ;
		}
		return 1 + Math.max(calcheight(cur.left), calcheight(cur.right));
	}
	
	public int checkleft(Node pass){
		Node cur = pass;
		int c =0;
		while(cur != null){
			cur = cur.left;
			c = c+ 1;
		}
		return c;
	}
	
	public int checkright(Node pass){
		Node cur = pass;
		int c =0;
		while(cur != null){
			cur = cur.right;
			c = c+ 1;
		}
		return c;
	}
	
	
	
	
	public static void main(String[] args){
		binarytree btr = new binarytree();
		btr.addNode(15);
		btr.addNode(6);
		btr.addNode(18);
		btr.addNode(3);
		btr.addNode(7);
		btr.addNode(17);
		btr.addNode(20);
		btr.addNode(2);
		btr.addNode(4);
		btr.addNode(13);
		btr.addNode(9);
		btr.display();
		btr.checkbalance();
	}
	
	
}
