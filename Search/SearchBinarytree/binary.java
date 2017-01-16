/**
 * Created by biplabkumardas on 1/7/17.
 */
class binary {
    private Node root;
    private int nelms;
    public binary(){
        root = null;
        nelms = 0; //  for checking the number of nodes entered
    }
    public void display(){

    }
    // inserting the elements
    public void insert(int id, double md){
        Node crntNode = new Node();
        crntNode.idata = id;
        crntNode.ddata = md;
        if(root == null){
            root = crntNode;
        }
        else{// that means if root is already occupied
            // so we need to check which side the new node will be inserted
            // depending on the node value
            Node parent;
            Node current = root;
            while(true){
                parent = current;
                if(id < current.idata){ // when it comes for the next loop it wil be compared with the latest current node value having the childs values
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = crntNode;
                        return;
                    } // otherwise it will fail and again move to the next node
                }
                else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = crntNode;
                        return;
                    }
                }
            } //  end of while loop
        } // end of else loop
    } //  end of the function

    public void delete(int key){

    }

    public Node find(int key){
        Node cur = new Node();
        cur = root;
        while(cur.idata != key){
              if(cur.idata < key){
                  cur = cur.rightChild;
              }
              else{
                  cur = cur.leftChild;
              }
              if(cur == null){
                  return null;
              }
        }
        return cur;
    }

    public boolean deleteNode(int key1){
        Node present = root;
        Node parent = root;
        Boolean isLeftchild = true;
        // this part is for finding the node specified by the key
        while(present != null){
            parent = present;
            if(key1 < present.idata){
                isLeftchild = true;
                present = present.leftChild;
            }

            else{
                if(key1 > present.idata){
                    isLeftchild = false;
                    present = present.leftChild;
                }
            }
            if(present == null ){
                return false;
            }
        } //  end of while loop
        // node with no children
        if(present.leftChild == null && present.rightChild == null) {
            if (present == root) {
                root = null;
            } else if (isLeftchild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
            // node with one children
        } // end of main if statement
        // node with one children- that is left child
        else if(present.leftChild == null){
            if(present == root){
                root = present.rightChild;
            }
            else if(isLeftchild){
                parent.leftChild = present.leftChild;
            }
            else{
                parent.rightChild = present.rightChild;
            }
        }
        // deleting a node having one children that is right child
        else if(present.rightChild == null){
            if(present == root){
                root = present.leftChild;
            }
            else if(isLeftchild){
                parent.leftChild = present.leftChild;
            }
            else{
                parent.rightChild = present.rightChild;
            }
        }
        // deleting a node having 2 children
        else{
            if(present == root){

            }
        }
        return true;
    }
}
