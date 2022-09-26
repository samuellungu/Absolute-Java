public class PrintN {
    public static void main(String [] args){
        printN(4);
    }
    public static void printN(int n){
        //int i=0;

        if(n==1){
            System.out.println(n);
        }
        else {
            printN(n-1);
            //System.out.println("hoo");
            System.out.println(n);
            //i++;      
            //printN(n-1);     
            
        }
           
    }
}
