public class TurnTaker {
    
    private static int turn=0;
    private int myTurn;
    private String name;

    public TurnTaker(String theName, int theTurn){
        name=theName;
        if(theTurn>=0)
            myTurn=theTurn;
        else{
            System.out.println("Fatal Error.");
            System.exit(0);
        }

    }
    public TurnTaker(){
        name="No Name yet";
        myTurn=0;
        
    }
    public static int getTurn(){
        turn++;
        return turn;
    }
    public boolean isMyTurn(){
        return (turn == myTurn);
    }
    public String getName(){
        return name;
    }
    
    public static void main(String[] args){
        TurnTaker lover1 = new TurnTaker("Romeo", 1);
        TurnTaker lover2 = new TurnTaker("Juliet", 3);
        //TurnTaker lover3 = new TurnTaker("Jul", -9);
        for (int i = 1; i < 5; i++){
            System.out.println("Turn = " + TurnTaker.getTurn());
            if (lover1.isMyTurn())
                System.out.println("Love from" + lover1.getName());
                //System.out.println("Love from" + lover3.getName());
            if (lover2.isMyTurn())
                System.out.println("Love from" + lover2.getName());
        }
        

    }
    
    
}
