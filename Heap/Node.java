/**
 * Created by biplabkumardas on 1/17/17.
 */
 class Node {
     public int idata;

     // constructor with parameters
    public Node(int id){                // for initialising
        idata = id;
    }

    public int getKey(){                // returns the nodes value
        return idata;
    }

    public void setKey(int id){         // sets the value for the new node, will be required for setting the nodes value from in between the code
        idata = id;
    }
}
