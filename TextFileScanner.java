import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileScanner {
    public static void main(String args []){
        System.out.println("I will read three Numbers and a Line");
        System.out.println("of text from the file morestuff.txt");

        Scanner sc=null;

        try{
            sc = new Scanner (new FileInputStream("morestuff.txt"));
        }catch(FileNotFoundException fe){
            System.out.println("File morestuff.txt could not be found");
            System.out.println("Or could not be opened");
            System.exit(0);
        }
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        sc.nextLine();
        String line = sc.nextLine();
        System.out.println("The Three numbers read from the file are: ");
        System.out.println(n1+"," +n2+ ", and "+n3);

        System.out.println("The Three numbers read from the file are: ");
        System.out.println(line);
        sc.close();


    }
    
}
