import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilityClass {

    public static int max(int...args){

        if(args.length==0){
            System.out.println("Exit");
            System.exit(0);            
        }
        
        int largest=args[0];
        for(int element : args){
            if(element>largest){
                largest=element;
            }
        }            
        return largest;
    }
    public static int [] readInts(){
        int a [] ;
        System.out.println("Enter Scores for which You want to Compute the Maximum");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st= new StringTokenizer(str," ");
        a=new int[st.countTokens()];

        while(st.hasMoreTokens()){
            for(int i=0;i<a.length;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
        }
                
        sc.close();
        return a;
    }
    public static void main(String [] args){
        /*System.out.println("Enter scores for Tom, Dick, and Harriet:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st= new StringTokenizer(str," ");
        int tomsScore = keyboard.nextInt();
        int dicksScore = keyboard.nextInt();
        int harrietsScore = keyboard.nextInt();
        int highestScore =  UtilityClass.max(tomsScore, dicksScore,harrietsScore);*/
        //System.out.println(st.countTokens());
        //sc.close();
        System.out.println("The Maximum of those Numbers is "+ max(readInts()));
    }
}
