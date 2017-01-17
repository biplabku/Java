/**
 * Created by biplabkumardas on 1/17/17.
 */
class heap {
    private Node[] heapArray;
    private int maxsize;
    private int currentsize;

    public heap(int s){
        maxsize = s;
        heapArray = new Node[maxsize];
        currentsize = 0;
    }


    // insert routine needs to satisfy few conditions
    // 1. check whether the array is empty
    // 2. check whether the array is full, in that case return false- cannot be inserted
    // 3. after its inserted check whether the node above it is larger or smaller if larger keep the way it is, but if smaller then move up until it finds a smaller element

    public boolean insert(int key){        // for inserting the new node data into the array or the heap
        if(currentsize == maxsize)
        {
            return false;
        }
        Node newnode = new Node(key);
        heapArray[currentsize] = newnode;
        moveUp(currentsize++);
        return true;
    }


    // while moving up what conditions needs to be checked
    // 1. check the above node for the value less than the current size
    // 2. does all the check for whether the node is higher or lesser than the above or below node and after comparison is made finally the swap is done. that is only one swap takes place
    public void moveUp(int index){
        int parent = (index - 1)/2;
        Node neno = heapArray[index];
        while(index > 0 && heapArray[index].getKey() < neno.getKey()){
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1)/2;
        }
        heapArray[parent] = neno;
    }



    // for removing one node various conditions needs to be checked before we can make a remove operation
    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[currentsize - 1];
        trickledown(0);
        return root;
    }

    public void trickledown(int index){
        Node top = heapArray[index];
        int largerchild;
        while(index < currentsize/2){
            int leftchild = 2*index + 1;
            int rightchild = 2*index + 2;
            if(rightchild < currentsize && heapArray[leftchild].getKey() < heapArray[rightchild].getKey()){
                largerchild = rightchild;
            }
            else{
                largerchild = leftchild;
            }
            if(top.getKey() > heapArray[index].getKey()){
                break;
            }
            heapArray[index] = heapArray[largerchild];
            index = largerchild;
        }
        heapArray[index] = top;
    }

    public void display(){
        Node root = heapArray[0];
        int count = 0;

        System.out.println("Heap data is shown below -- ");
        while(count != currentsize){
            System.out.println(" " + heapArray[count].getKey());
            count = count + 1;
        }
        System.out.println("----");
    }

}














