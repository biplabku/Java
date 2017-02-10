	
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
		// find the minimum 
		// largest number will always lie on the right
		if(cur.right != null ){
			Node n = cur.right;
			while(n.left != null && n.data > x.data){
				n = n.left;
			}
			return n.data;
		}
		return parent.data;

		
	}
