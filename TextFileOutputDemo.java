import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


public class TextFileOutputDemo {
    public static void main(String [] args){
        PrintWriter outputStream=null;

        try{
            outputStream = new PrintWriter(new FileOutputStream("stuff.txt"));
        }catch (FileNotFoundException e){
            System.out.println("Error Opening the file Stuff.txt");
            System.exit(0);
        
        }
        System.out.println("Writing to file");
        outputStream.println("The Quick brown fox");
        outputStream.println("Jumps over the Lazy Dog");
        outputStream.close();
        System.out.println("End of Program");
    }
    
}
