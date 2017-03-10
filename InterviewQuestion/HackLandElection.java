import java.util.*;

/**
 * Created by biplabkumardas on 3/10/17.
 */ 
 
public class HacklandElection {
    private String[] votes = new String[]{"jon","jon", "jon", "mary", "sab", "bad", "bad" };
    public static void main(String[] args){
        HacklandElection hs = new HacklandElection();
        System.out.println(hs.HacklandWinner());
    }

    public String HacklandWinner(){
        String result = " ";
        Arrays.sort(votes);
        HashMap<String, Integer> hmap = new HashMap<>();
        for(int i = 0; i < votes.length; i++){
            if(hmap.containsKey(votes[i])){
                hmap.put(votes[i], hmap.get(votes[i]) + 1);
            }else{
                hmap.put(votes[i],  1);
            }
        }
        Set entryset = hmap.entrySet();
        Iterator it = entryset.iterator();
        int len = 0;
        while(it.hasNext()){
            Map.Entry m = (Map.Entry)it.next();
            if(len < (Integer) m.getValue()){
                len = (Integer) m. getValue();
                result = (String) m.getKey();
            }
        }
        return result;
    }
}
