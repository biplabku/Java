/**
 * Created by biplabkumardas on 1/12/17.
 */
class stack {
    private int maxsize;
    private int top;
    public int min ;
    private int[] stac;
    public stack(int s){
        maxsize = s;
        stac = new int[maxsize];
        top = -1;
        min = 0;
    }

    public void push(int data){
        top = top + 1;
        stac[top] = data;
    }

    // push with finding the minimum value
    public void pushwithmin(int data){
        top = top +1;
        stac[top] = data;
        int val = stac[0];
        if(val > stac[top]){
            min = stac[top];
        }
    }
    public int rtmin(){
        return min;
    }
    // end of push with minimum function time complexity reduced to O(1);

    public int peek(){
        return stac[top];
    }

    // problem is time complexity is O(N)
    public int getmin(){
        min = peek();
        while(top != 0){
            int val = peek();
            if(min > val){
                min = val;
            }
            top = top - 1;
        }
        return min;
    }

    public int pop(){
        if(top < 0){
            return -1;
        }
        top = top - 1;
        return stac[top];
    }

    public void display(){
        for(int i = 0; i <= top; i++){
            System.out.println(stac[i]);
        }
        System.out.println(" ");
    }

}
