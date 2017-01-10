/**
 * Created by biplabkumardas on 1/9/17.
 */
class Tree {
    private Node root;
    private int nelms;
    // constructor
    public Tree(){
        root = null;
        nelms = 0;
    }

    public void insertFirst(int s1, double d2){
        Node current = new Node(s1, d2);
        root = current;
    }

    public void displayall(){
        System.out.println(root.idata);
    }


    public Node find(int key){
        Node current = root;
        while(current.idata != key){
            if(current.idata > key){ // search leftchild if its less than the key value
                current = current.leftchild;
            }
            else{ // if the node values is larger than the key value search the right child
                current = current.rightchild;
            } //  end of if-else statements
            if(current == null){
                return null;
            }
        } //  end of while loop
        // finally when the while loop encounters the key value it will return the key value
        return current;
    }

    // general insert function for the tree
    public Node generalInsert(int d1, double d2){
        Node nNode = new Node(d1, d2);
        if(root == null){
            root = nNode;
        }
        //  condition when there are already elements in the tree
        // so you need to find the exact position where the node needs to be inserted
        // it will have same routine as find just the fact is after finding you need
        // to enter the node to that particular position
        else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if(current.idata > d1){ // check left child
                    // that means update the current node and check if its null otherwise move ahead
                    // if its null that means the node can be inserted here.
                    current = current.leftchild;
                    if(current == null){
                        parent.leftchild = nNode;
                        return nNode;
                    }
                }
                else{
                    current = current.rightchild;
                    if(current == null){
                        parent.rightchild = nNode;
                        return nNode;
                    }
                }

            } //  end of while loop
        } //  end of if-else loop
        return nNode;
    } //  end of the insertt function// needs to be modified

    public boolean deleteANode(int key){
        Node current = root;
        Node parent  = root;
        boolean isLeftchild = true;
        while(current.idata != key){
            parent = current;
            if(current.idata > key){ // needs to check left
                isLeftchild = true;
                current = current.leftchild;

            }
            else { // check right subtree of the tree
                isLeftchild = false;
                current = current.rightchild;
            }
        }
        // if the there are no nodes that means the Node does not exist or the key does not matches with a
        // any other remaining nodes per se so returning null will be simplest idea behind the logic
        if(current == null){
            return false;
        }


        // after the above steps we are able to find the current node having the key values as the node value
        // we are sure that current node has the desired key values
        // but we cannot directly delete the node as it might be having child.
        // if it doesnot have left and right child we can directly delete the nodes but if it has right child or
        // left child then we need to have some operations performed on the remaining children of that particular node

        // below code shows that parent has the previous node so we need to check whether it was right child or left child
        // and after finding disconnect the node by assigning it null
        if(current.leftchild == null && current.rightchild == null) { //
            if(current == root){
                return false;
            }
            else if(isLeftchild){
                parent.leftchild = null;
            }
            else{
                parent.rightchild = null;
            }
        }

        // next up is second condition if it has one child that is only the right child
        else if(current.leftchild == null ){
            if(current == root) {
                root = current.rightchild;
            }
            else if(isLeftchild){
                parent.leftchild = current.rightchild;
            }
            else{
                parent.rightchild = current.rightchild;
            }
        }
        // next condition is when there is no right child
        else if(current.rightchild == null){
            if(current == root) {
                root = current.leftchild;
            }
            else if(isLeftchild){
                parent.leftchild = current.leftchild;
            }
            else{
                parent.rightchild = current.leftchild;
            }
        }

        // final condition is if it has 2 children that is both left and right children then
        // how would you remove that particular node and how will you attach the nodes to succedding nodes
        // bit of a complication here since we need to take into account how the connection should be made after the
        // nodes are removed from the binary tree so that the conitnuation shaould be mainted in the first place.

        else{ //  code for deleting the node which has 2 children
            Node successor = findSuccessor(current);
            if(current == root){
                root = successor;
            }
            else if(isLeftchild){
                parent.leftchild = successor;
            }
            else{
                parent.rightchild = successor;
            }
            successor.leftchild = current.leftchild;
        } // end of last else statement and also the end of delete function
        return true;
    }  // end of delete function

    private Node findSuccessor(Node nod){
        Node findsuccessor = nod ;
        Node successor = nod;
        Node current = nod.rightchild;
        while(current != null){
            findsuccessor = successor;
            successor = current;
            current = current.leftchild;

        }
        if(successor != nod.rightchild){
            findsuccessor.leftchild = successor.rightchild;
            successor.rightchild = nod.rightchild;
        }
        return  successor;
    } //  end of findSuccessor function
}
