
public class Stack {
	
	public final int size = 20;
	public int[] stackar;
	public int top;
	
	public Stack(){
		stackar = new int[size];
		top = -1;
	}
	
	public int peek(){
		return stackar[top];
	}
	
	public void push(int i){
		stackar[++top] = i;
	}
	
	public int pop(){
		int item = stackar[top--];
		return item;
	}

	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		return false;
	}
}
