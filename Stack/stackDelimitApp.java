import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/2/17.
 */
class stackDelimitApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] s1 = s.toCharArray();
        stackDelimit sd = new stackDelimit(s1.length);
        for(int i = 0 ; i < s1.length; i++){
            sd.push(s1[i]);
        }
    }
}
