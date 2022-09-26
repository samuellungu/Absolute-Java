import java.util.Scanner;

public class Averager {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double sum=0;
        int count=0;
        double average;
        int value=sc.nextInt();

        while(value>0){
            sum=sum+value;
            ++count;
            value=sc.nextInt();
        }
        if(count==0){
            System.out.println("No values Entered System Will Exit");
            System.exit(0);
        }
        else{
            average = sum/count;
            System.out.println(average);
        }
            
            sc.close();
    }
}
