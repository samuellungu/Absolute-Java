public class ExerciseRecursion {
    
    public static void main(String[] args)
    {
        stars(1);
    }
    public static void stars(int n)
    {
        if (n<=1)
        {
            System.out.println("*");
        }
        else
        {
            System.out.print("*");
            stars(n-1);
        }
    }
}
    

