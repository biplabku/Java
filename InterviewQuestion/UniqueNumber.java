import java.util.*;

/**
 * Created by biplabkumardas on 3/15/17.
 */
public class duplicateNumber {
    // finding the not duplicte number using in ON solution

    private int[] arr = new int[]{1,1,2,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9};


    // need to use the hashmap since there will be one unique number
    public int nonDuplicate(){
        int result = 0;
        HashMap<Integer, Integer > hs = new HashMap();
        // first integer is the key and we will add the values after it has saved the counter
        // this function should work efficiently even if its not sorted
        for(int i = 0; i< arr.length; i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i], hs.get(arr[i]) + 1);
            }else {
                hs.put(arr[i], 1);
            }
        }
        Set seten = hs.entrySet();
        Iterator it = seten.iterator();

        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            //System.out.println(me.getKey());
            if((Integer)me.getValue() == 1){
                result = (Integer) me.getKey();
                break;
            }
        }
        // the number has been saved now i need to check whether whihc neumber has
        // only one entry as one value

        return result;
    }

    public static void main(String[] args){
        duplicateNumber dp = new duplicateNumber();
        System.out.println(dp.nonDuplicate());
    }

}
