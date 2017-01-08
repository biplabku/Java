/**
 * Created by biplabkumardas on 1/2/17.
 */
class stackDelimit {
    private char[] stra;
    private int maxsize;
    private int top;
    public stackDelimit(int s){
        maxsize = s;
        stra = new char[maxsize];
        top = -1;
    }

    public void display(){
        for(int i = 0; i < )
        System.out.println(" ");
    }

    public void push(char s){
        // check whether the stack is already filed or not
        if(top <= maxsize){
            top = top + 1;
            stra[top] = s;
        }
        else{
            System.out.println("Stack Size exceeded.  ");
        }
    }


    public void pop(char s1){
        // check whether the stack is empty
        if(top == -1){
            System.out.println("Stack is empty  ");
        }
        else{
            top = top - 1;
        }
    }
}
