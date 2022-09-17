public class Node{

    private Node parent;
    private int myNum;
    private Node child;

    public Node(int num, Node p){ 
        parent = p;
        myNum = num;
    }

    public Node getParent(){
        return parent;
    }

    public Node getChild(){
        return child;
    }

    public void setChild(Node c){
        child = c;
    }

    public void setParent(Node p){
        parent = p;
    }

    public int getNum(){
        return myNum;
    }

}