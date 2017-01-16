import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/4/17.
 */
class uniqueApp {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        String sname = in.nextLine();
        System.out.println(checkUnique(sname));
    }
    public static boolean checkUnique(String name){
        int temp = 0;

        for(int i = 0; i < name.length(); i++){
            char s = name.charAt(i);
            if(s == ' '){
                i = i + 1;
                break;
            }
            for(int j = i+1; j < name.length() ; j++){
                if(s == name.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

}
