import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/2/17.
 */
class stackApp {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        StackX st = new StackX(10);
        st.push(1);
        st.push(3);
        st.push(0);
        st.push(9);
        st.push(7);
        st.display();

    }
}
