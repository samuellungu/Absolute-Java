public class PrintfDemo{
    
    public static void main(String[] args){
         String aString = "Jelly beans";
            System.out.println("START1234567890");
            System.out.printf("START%sEND %n", aString);
            System.out.printf("START%4sEND %n", aString);
            System.out.printf("START%13sEND %n", aString);
            System.out.println();
     }
}