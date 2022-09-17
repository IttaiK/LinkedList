public class linkedList{

    Node root = null;
    Node lastParent = null;
    
    public linkedList(){}

    //returns the root
    public Integer getRoot(){
        if(root == null){
            return null;
        }
        return root.getNum();
    }

    //inserts a desired node into the tree
    public void insert(int num){
        if(lastParent == null){
            root = new Node(num, null);
            lastParent = root;
        } else{
            Node temp = new Node(num, lastParent);
            lastParent.setChild(temp);
            temp.setParent(lastParent);
            lastParent = temp;
        }
    }

    //deletes a desired node
    public void delete(int num){
        Node scan = root;
        while(scan.getNum() != num){
            try{
                scan = scan.getChild();
            } catch(Exception NullPointerException){
                throw new RuntimeException("DeleteNumNotInLinkedList");
            }
        }
        if(scan == root){
            scan.getChild().setParent(null);
            root = scan.getChild();
        }else if(scan.getChild() == null){
            scan.getParent().setChild(null);
            scan.setParent(null);
        }else{
            scan.getChild().setParent(scan.getParent());
            scan.getParent().setChild(scan.getChild());
            scan.setParent(null);
            scan.setChild(null);
        }
    }

    //prints the list in the order it is being stored
    public String printWalk(){
        String out = "";
        Node scan = root;
        while(scan != null){
            out += scan.getNum() + " ";
            scan = scan.getChild();
        }
        return out;
    }

    //finds minimum value in the linked list
    public int findMinimum(){
        if(root == null){
            throw new RuntimeException("NoMinimumOfEmptyLinkedLIst");
        }
        int out = Integer.MAX_VALUE;
        Node scan = root;
        while(scan != null){
            out = Math.min(scan.getNum(), out);
            scan = scan.getChild();
        }
        return out;
    }
}