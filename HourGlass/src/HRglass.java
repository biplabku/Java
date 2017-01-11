/**
 * Created by biplabkumardas on 12/19/16.
 * Program for finding the maximum hourglass
 */
import java.lang.reflect.Array;
import java.util.*;
public class HRglass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // main input grid for the program
        int[][] grid = compGrid();
        int[] val = new int[3];
        val = compNum(grid, n);
        System.out.println("The maximum value of a hour glass is : " + val[0]);
        //System.out.println("The grid with maximum value is : " + compRGrid(val[2], val[1], grid));

    }
    // needs to be called for everytime a new grid is given
    public static int[] compNum(int[][] grd, int y) {
        int[][] h = new int[][]{
                {1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[] max = new int[3];
        int temp = 0;
        max[0] = 0;
        for(int cnx = 0; cnx < (y-2); cnx++) {
            for (int count = 0; count < (y-2); count++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp = temp + h[i][j] * grd[cnx + i ][count + j ];
                    }
                }
                max[1] = count;
                max[2] = cnx;
                if(temp > max[0]) {
                    max[0] = temp;
                    max[1] = cnx;
                    max[2] = count;
                }
                else{
                    max[0] = max[0];
                }
                temp = 0;
            }
        }
        return max;
    }
    // needs to called for computing a grid
    public static int[][] compGrid(){
        int [][] ar= new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4 ,0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4 ,0}
        };
        return ar;
    }
    // constructing random grid according to the parameters
    public static int[][] compRGrid(int x1, int y1, int[][] grid1){
        int[][] ara = new int[x1][y1];

        for(int i = x1; i <= (x1+3); i++){
            for(int j = y1; j <= (y1+3); y1++){
                System.out.println(x1 + " " + y1 + " " + i + " " + j);
                ara[i][j] = grid1[x1][y1];
            }
        }
        return ara;
    }
}
