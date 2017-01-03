/**
 * Created by biplabkumardas on 1/2/17.
 */
class StackX {
    private int maxsize;
    private long[] stckar;
    private int top;

    public StackX(int s){
        maxsize = s;
        top = -1;
        stckar = new long[maxsize];
    }
    // pushing or inserting the items inside the stack
    public void push(long s1){
        top = top + 1;
        stckar[top] = s1;
    }

    // Popping or deleting the items from a stack
    public void pop(){
        top = top - 1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stckar[i]);
        }
        System.out.println(" ");
    }
}
