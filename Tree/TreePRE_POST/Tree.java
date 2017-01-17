/**
 * Created by biplabkumardas on 1/16/17.
 */
class Tree {
    private Node root;
    private int nelms;
    // parametrized constructor
    public Tree(){
        root = null;
        nelms = 0;
    }

    // find a particular node when the node key is given.
    public Node find(int findk){
        Node cur = root;
        while(cur.idata != findk){      // this part is required for incrementing to the next step
            if(findk < cur.idata){      // check the left child;
                cur = cur.leftchild;
            }
            else if(cur == null){
                return null;
            }
            else{                       // check the right child
                cur = cur.rightchild;
            }
        }
        return cur;                     // if its equal then we should return the node itself
    }

    // insert -  first if root node is equal to null then directly insert other wise perform some operations
    public void insert(int id, double dd){
        Node nnode = new Node(id, dd);
        if(root == null){                // if first node is null then assign the new node to it
            root = nnode;
        }
        else{                           // if not then check where the new node needs to be inserted that is using the find details to insert the new node
            Node cur = root;
            Node parent;
            while(true){
                parent = cur;
                if(nnode.idata < cur.idata){
                    cur = cur.leftchild;
                    if(cur == null){
                        parent.leftchild = nnode;
                        return;         // return to the while loop
                    }
                }
                else{
                    cur = cur.rightchild;
                    if(cur == null){
                        parent.rightchild = nnode;
                        return;
                    }
                }                       // end of mian  if - else loop
            }                           // end of while function
        }                               // end of else function
    }                                   // end of main insert function.


    // deleting a function when the "key" word is given
    public boolean delete(int key){
        Node cur = root;
        Node parent = root;
        boolean isleftChild = true;
        // there will be many conditions to check for deleting any node
        // 1. first node itself is the node to be deleted
        // 2. node with no child
        // 3. node with one child
        // 4. node with 2 child
        while(cur.idata != key){
            parent = cur;               // will always be having the previous node
            if(key < cur.idata){        // that means search on the left
                isleftChild = true;
                cur = cur.leftchild;
            }
            else{                       // means check on the right side, that is right child
                isleftChild = false;
                cur = cur.rightchild;
            }
            if(cur == null){
                return false;
            }
        }                               // end of while. this while loop just gives us the node if it is able to find, next steps is to check and delte
        // 2. if no children
        if(cur.leftchild == null && cur.rightchild == null){
            if(cur == null){
                root = null;
            }
            else if(isleftChild){
                parent.leftchild = null;// disconnecting the parent frm the children or setting its right and left child nodes to null;
            }
            else{
                parent.rightchild = null;
            }
        }                               // end of first case when there are no child nodes
        // 3. having only one child that is right child
        else if(cur.rightchild == null){// having only one child that is right child
            if(cur == root){
                root = cur.leftchild;
            }
            else if(isleftChild){
                parent.leftchild = cur.leftchild;
            }
            else{
                parent.rightchild = cur.rightchild;
            }
        }
        // 3. having only one child that is left child
        else if(cur.leftchild == null) {// having only one child that is left child
            if(cur == root){
                root = cur.leftchild;
            }
            else if(isleftChild){
                parent.leftchild = cur.rightchild;
            }
            else{
                parent.rightchild = cur.rightchild;
            }
        }
        // 4. having 2 children
        else{                           // having 2 children
            Node successor = getSuccessor(cur);
            if(cur == root){
                root = successor;
            }
            else if(isleftChild){
                parent.leftchild = successor;
            }
            else{
                parent.rightchild = successor;
            }
            successor.leftchild = cur.leftchild;
        }
        return true;                   // that means if the first node itself is null, we return null, that is no node to delete;
    }                                   // end of main delete function

    public Node getSuccessor(Node dNode){
        Node parent = dNode;
        Node successor = dNode;
        Node cur = dNode.rightchild;
        while(cur != null){             // finding the next highest node
            parent = cur;
            successor = cur;
            cur = cur.leftchild;
        }
        if(successor != dNode.rightchild){
            parent.leftchild = successor.rightchild;
            successor.rightchild = dNode.rightchild;
        }
        return successor;
    }

    public void traverse(int type){
        switch (type){
            case 1: System.out.println("\n Inorder traversal: ");
                    inOrder(root);
                    break;
            case 2: System.out.println("\n Preorder traversal: ");
                    preOrder(root);
                    break;
            case 3: System.out.println("\n Postorder traversal: ");
                    postOrder(root);
                    break;
            default: System.out.println("\n Invalid Entry : ");
        }
        System.out.println(" ");
    }


    public void inOrder(Node nroot){
        if(nroot != null){
            inOrder(nroot.leftchild);
            System.out.println(nroot.idata + " ");
            inOrder(nroot.rightchild);
        }
    }

    public void preOrder(Node nroot){
        if(nroot != null){
            System.out.println(nroot.idata + " ");
            preOrder(nroot.leftchild);
            preOrder(nroot.rightchild);
        }
    }

    public void postOrder(Node nroot){
        if(nroot != null){
            postOrder(nroot.leftchild);
            postOrder(nroot.rightchild);
            System.out.println(nroot.idata + " ");
        }
    }

}











