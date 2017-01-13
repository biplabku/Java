import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/13/17.
 */
class stack3App {

    // passing the input array into this function so that we can compute the stack array into
    // 3 stacks or more importantly divide into 3 other arrays accrodingly to suitable dimesnsions

    public static  void implement3stack(int[] inpt){
        int len = inpt.length;

    }

    public static  void main(String[] args){
        /*
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the size of the array you want to see -- ? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        Stack st = new Stack(5);
        for(int i = 0; i < 5; i++){
            st.push(in.nextInt());
        }

        st.display();
        System.out.println("poped values " + st.pop() + " top value " + st.peek());
        */
        stackLink ls = new stackLink();
        ls.push(4);
        ls.push(1);
        ls.push(3);
        ls.push(7);
        ls.push(8);
        ls.display();
        System.out.println("poped - " + ls.pop());
        ls.display();
        System.out.println(ls.peek());
        //implement3stack(arr);
        // this will be the end of the function;
    }
}
