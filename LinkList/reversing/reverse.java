
public class Linkedlist {
	public Node head;
	public int nlems ;
	public Linkedlist(){
		head = null;
		nlems = 0;
	}
	
	
	public void insertattail(int data){
		Node nnode = new Node(data);
		Node cur = head;
		Node prev = null;
		if(cur == null){
			head = nnode;
			nnode.next = null;
		}
		else{
			while(cur != null){
				prev = cur;
				cur = cur.next;
			}
			prev.next = nnode;
			nnode.next = cur;
		}
		nlems++;
	}
	
	public void insertat
	
	public void reverseLinklist(){
		Node cur = head;
		Node prev = null;
		Node nxt = null;
		while(cur != null){
			nxt = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nxt;
		}
		head = prev;
		display();
	}
	
	public void display(){
		Node cur = head;
		System.out.print("Head");
		while(cur != null){
			System.out.print(" -- > ");
			System.out.print(cur.data );
			cur = cur.next;
		}
		System.out.print(" -- > ");
		System.out.println(" Tail");
	}
	
	public static void main(String[] args){
		Linkedlist ls = new Linkedlist();
		ls.insertattail(12);
		ls.insertattail(5);
		ls.insertattail(21);
		ls.insertattail(91);
		ls.display();
		System.out.println("Reversing a linklist is given by -- > ");
		ls.reverseLinklist();
	}
}
