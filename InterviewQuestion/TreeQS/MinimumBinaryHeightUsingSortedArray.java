

// given a sorted array in increasing array create a binary search tree with minimum height;
// what is minimum height = = it usually means a balanced tree in this case. that means every node has two elements except sometimes the last node having one or zero elements;

// one way i think the top node should be the highest
public class TreeWithMinimumHeight {
	public Node root;
	public TreeWithMinimumHeight(){
		root = null;
	}
	
	
	public Node minimumHeight(int[] arr, int start, int last){
		if(start > last){
			return null;
		}
		int middle = (start + last)/2;
		Node root = new Node(arr[middle]);
		root.leftchild = minimumHeight(arr, start, middle - 1);
		root.rightchild = minimumHeight(arr, middle+1, last);
		System.out.println(root.data);
		return root;
	}
	
	public void inOrder(Node root) {  
		  if(root ==  null){
			  return;
		  }
		  inOrder(root.leftchild);     
		  System.out.println(root.data);  
		  inOrder(root.rightchild);   
	}  

	
	
	public static void main(String[] args){
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		TreeWithMinimumHeight tr = new TreeWithMinimumHeight();
		tr.minimumHeight(array, 0, (array.length-1));
		Node root = new Node(array[array.length/2]);
		tr.inOrder(root);
	}
}
