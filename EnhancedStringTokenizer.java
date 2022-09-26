import java.util.StringTokenizer;
import java.util.Scanner;

public class EnhancedStringTokenizer extends StringTokenizer{

    private String [] a;
    private int count;

    public EnhancedStringTokenizer(String theString){
        super(theString);
        a = new String[countTokens()];
        count=0;
    }
    public EnhancedStringTokenizer(String theString, String delimiters){
        super(theString, delimiters);
        a = new String[countTokens()];
        count=0;
    }
    public String nextToken(){
        String token = super.nextToken();
        a[count]=token;
        count++;
        return token;
    }
    public String nextToken(String delimiters){
        String token = super.nextToken(delimiters);
        a[count]=token;
        count++;
        return token;
    }
    public String [] tokensSoFar(){
        String [] arrayToReturn = new String[count];
        for(int i=0; i< count; i ++)
            arrayToReturn[i]=a[i];
        return arrayToReturn;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sentence=sc.nextLine();

        EnhancedStringTokenizer wordFactory = new EnhancedStringTokenizer(sentence);
        System.out.println("Your Sentence with extra Blanks is deleted");
        while(wordFactory.hasMoreTokens())
            System.out.print(wordFactory.nextToken()+ " ");
        System.out.println();

        System.out.println("Sentence with each word on a separate line ");
        String [] tokens = wordFactory.tokensSoFar();
        for(int i =0; i < tokens.length;i++)
            System.out.println(tokens[i]);

        sc.close();



    }
}
