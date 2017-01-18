/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapgrid;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author biplabkumardas
 */
public class Mapgrid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        char[][] out = map_gen(n);
        printArray(out);
        System.out.print(Arrays.deepToString(out));
        // now code for checking the position for the princess
        //check_princess(out);
        
    }
    public static char[][] map_gen(int x){
        char[][] map = new char[x][x];
        for (int i = 0; i < x; i++){
            for(int j = 0 ; j < x; j++){
                map[i][j] = '-';
            }
        }
        return map;
    }
    //public static int check_princess(char[][] outar){
        
    //}
}
