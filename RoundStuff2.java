import java.util.Scanner;

public class RoundStuff2
{
    public static final double PI = 3.14159;

    /**
    Return the area of a circle of the given radius.
     */
    public double area(double radius)
    {
        return (PI*radius*radius);
    }
     
       /**
       Return the volume of a sphere of the given radius.
       */
    public static double volume(double radius)
    {
        return ((4.0/3.0)*PI*radius*radius*radius);
    }
   
public static void main(String[] args)
   
{
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter radius:");
          
    double radius = keyboard.nextDouble();
     
          
    System.out.println("A circle of radius "  + radius + "inches");
    System.out.println("has an area of " + new RoundStuff2().area(radius) + " square inches.");
          
    System.out.println("A sphere of radius " + radius + "inches");
    System.out.println("has an volume of " + RoundStuff2.volume(radius) + " cubic inches.");
    keyboard.close();
       
}
 }