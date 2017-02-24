
        public boolean checkBinarySearchTree(){
            Node cur = root;
            if(cur == null){
                return true;
            }
            if(checkleftright(cur)){
                return true;
            }
            return false;
        }

        public boolean checkleftright(Node cur){
            if(cur.left != null && cur.right != null){
                if(cur.left.data < cur.data && cur.right.data > cur.data){
                    cur = cur.left;
                    checkleftright(cur);
                }else{
                    return false;
                }
            }else if(cur.left != null && cur.right == null){
                if(cur.left.data < cur.data){
                    cur = cur.left;
                    checkleftright(cur);
                }else{
                    return false;
                }
            }
            return true;
        }
