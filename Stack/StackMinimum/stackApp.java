import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/12/17.
 */
class stackApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        stack st = new stack(5);
        st.pushwithmin(15);
        st.pushwithmin(12);
        st.pushwithmin(1);
        st.pushwithmin(10);
        st.pushwithmin(1);

        st.display();
        System.out.println("Minimum value is -- > " + st.rtmin());

    }
}
