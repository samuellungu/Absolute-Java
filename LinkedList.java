public class LinkedList{
    private Node head;

    public LinkedList(){
        head=null;

    }
    public void addToStart(String itemName, int countName){
        head= new Node(itemName, countName, head);
    }
    //delete the head node by refering head.next ==null
    public boolean deleteHeadNode(){
        if(head!=null){
            head=head.getNext();
            return true;
        }
        else
            return false;
    }
    public int size(){
        int count =0;
        Node position = head;
        while(position!=null){
            count++;
            position=position.getNext();
        }
        return count;
    }
    public boolean contains(String item){
        return (find(item)!=null);
    }
    private Node find(String target){
        Node position = head;
        while(position!=null){
            if(position.getItem().equals(target)){
                return position;
            }
            position=position.getNext();
        }
        return null;//target was not found
    }
    public void outputList(){
        Node position = head;
        while(position!=null){
            System.out.println(position.getItem( ) + " " + position.getCount( ));
            position = position.getNext();
        }
    }
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.addToStart("Apples", 1);
        list.addToStart("Bananas", 2);
        list.addToStart("Cantaloupe", 3);

        System.out.println("List has "+list.size()+" nodes.");
        list.outputList( );
        if (list.contains("Cantaloupe"))
            System.out.println("Cantaloupe is on list.");
        else
            System.out.println("Cantaloupe is NOT on list.");
        list.deleteHeadNode( );
        if (list.contains("Cantaloupe"))
            System.out.println("Cantaloupe is on list.");
        else
            System.out.println("Cantaloupe is NOT on list.");
        while (list.deleteHeadNode( ))
            ; //Empty loop body
        System.out.println("Start of list:");
        list.outputList( );
        System.out.println("End of list.");
    }
}