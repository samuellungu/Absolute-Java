public class Node {
    private String item;
    private int count;
    private Node next;

    public Node(){
        next=null;
        item=null;
        count=0;        
    }
    public Node(String newItem, int newCount, Node next){
        setData(newItem, newCount);
        this.next=next;
    }
    public void setData(String newItem, int newCount){
        item=newItem;
        count=newCount;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public String getItem(){
        return item;
    }
    public int getCount(){
        return count;
    }
    public Node getNext(){
        return next;
    }
}
