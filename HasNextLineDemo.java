import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;


public class HasNextLineDemo {
    public static void main (String [] args){
        Scanner inputStream = null;
        PrintWriter outputStream=null;

        try{
            inputStream = new Scanner(new FileInputStream("original.txt"));
            outputStream = new PrintWriter(new FileOutputStream("numbered.txt"));
        }catch(FileNotFoundException f){
            System.out.println("Problems opening files");
            System.exit(0);
        }
        String line=null;
        int count=0;
        while(inputStream.hasNextLine()){
            line=inputStream.nextLine();
            count++;
            outputStream.println(count+" "+line);
        }
        inputStream.close();
        outputStream.close();
    }
}
