import java.util.Scanner;
public class ArrayOfScores{
       /**
        Reads in 5 scores and shows how much each
        score differs from the highest score.
       */
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double[] score = new double[5];
        //int index;
        double max;

        System.out.println("Enter 5 scores:");
        score[0] = keyboard.nextDouble();
        
        max = score[0];
        
        
        for (int i = 1; i < 5; i++) {
            score[i] = keyboard.nextDouble();
            if (score[i] > max)
                max = score[i];
          //max is the largest of the values score[0],..., score[index].
        }
        System.out.println("The highest score is " + max);
        System.out.println("The scores are:");
        for (int i = 0; i < score.length; i++)
              System.out.println(score[i] + " differs from max by "
                                              + (max - score[i]));
        keyboard.close();
    }
}