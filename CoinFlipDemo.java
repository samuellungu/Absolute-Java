import java.util.Random;
public class CoinFlipDemo {
    public static void main(String [] args){
        int counter=0;
        Random rand=new Random();
        System.out.println("Welcome to the Coin Tossing Game");

        while(counter<5){
            int number=rand.nextInt(2);

            if(number==1){
                System.out.println("Heads");
            }
            else{
                System.out.println("Tails");
            }
            counter++;
        }
    }
}
