import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean done=false;
        int number = 0;

        while(!done){
            try{
                System.out.println("Enter a whole number");
                number = sc.nextInt();
                done=true;

            }catch(InputMismatchException ime){
                //sc.nextLine();
                System.out.println("Not a correctly written Whole Number");
                System.out.println("Try Again:");
                sc.nextLine();

            }

        }
        sc.close();
        System.out.println("The Number you entered is "+number);

    }
}
