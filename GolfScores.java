import java.util.Scanner;
import java.util.Arrays;

public class GolfScores {
    public static final int MAX_NUMBER_SCORES=10;
    
    public static int fillArray(double [] a){
        System.out.println("Enter upto "+a.length +" Non Negative Numbers");
        System.out.println("Mark end of the list with a negative number");

        Scanner sc=new Scanner(System.in);
        double next;
        int index=0;

        next=sc.nextDouble();

        while((next>=0) && (index<a.length)){
            a[index]=next;
            index++;
            next=sc.nextDouble();
        }
        if(next>=0){
            System.out.println("Could only read in "+a.length+" Input Values");
        }
        sc.close();
        return index;
    }
    public static double computeAverage(double [] a, int numberUsed){
        double total=0;
        for(int i=0;i<numberUsed;i++){
            total=total+a[i];
        }
        if(numberUsed>0){
            return (total/numberUsed);
        }
        else{
            System.out.println("Error Trying to Average 0 numbers");
            System.out.println("Compute Average returns 0");
            return 0;
        }
    }
    public static void showDifference(double[] a, int numberUsed)
    {
        double average = computeAverage(a, numberUsed);
        System.out.println("Average of the " + numberUsed
                                             + " scores = " + average);
        System.out.println("The scores are:");
        for (int index = 0; index < numberUsed; index++)
        System.out.println(a[index] + " differs from average by "
                                    + (a[index] - average));
    }
    public static void main(String[] args) 
    {
        double[] score = new double[MAX_NUMBER_SCORES];
        int numberUsed = 0;

        System.out.println("This program reads golf scores and shows");
        System.out.println("how much each differs from the average.");

        System.out.println("Enter golf scores:");
        numberUsed = fillArray(score);
        showDifference(score, numberUsed);

        System.out.println(Arrays.toString(score));

    }
}
