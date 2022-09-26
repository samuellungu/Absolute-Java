//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class CreateArray {
    public static double [] getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How big Is the Array You want to Create");
        int array_length=sc.nextInt();
        double[] scores = new double[array_length];
        System.out.println("Enter up to " + array_length + " nonnegative numbers.");
        System.out.println("Mark the end of the list with a negative number.");
        Scanner keyboard = new Scanner(System.in);
       
        int index = 0;
        double next = keyboard.nextDouble();
        while ((next >= 0) && (index < array_length)){
            scores[index] = next;
            index++;
            next = keyboard.nextDouble();
            //index is the number of array indexed variables used so far.
        }
        
        //index is the total number of array indexed variables used.
        
        
        sc.close();
        keyboard.close();
        return scores;

    }
    public static void main(String [] args){
        System.out.println("The Array Created Is "+ Arrays.toString(getArray()));
    }

}
