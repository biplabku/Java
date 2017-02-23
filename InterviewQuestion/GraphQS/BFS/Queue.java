
public class Queue {
	public final int size = 20;
	public int[] qArray;
	public int rear ;
	public int front;
	public Queue(){
		qArray = new int[size];
		rear = -1;
		front = 0;
	}
	
	public void enqu(int i){
		qArray[++rear] = i; 
	}
	
	public int deque(){
		return qArray[front++];
	}
	
	public int curEle(){
		return qArray[front];
	}
	public boolean isEmpty(){
		return (rear+1 == front);
	}
}
