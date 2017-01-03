/**
 * Created by biplabkumardas on 12/31/16.
 */
public class arrayclas {

    public int findel(int[] tmpar, int skey){
        int first_val = tmpar[0];
        int last_val = tmpar[tmpar.length - 1];
        int middle;
        while(true){
            middle = (first_val + last_val)/2;
            if(skey == middle){
                return middle;
            }
            else{
                if(skey < middle){
                    last_val = tmpar[middle - 1];
                }
                else{
                    first_val = tmpar[middle + 1];
                }
            }
        }// end of while loop
    }
}
