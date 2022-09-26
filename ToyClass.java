public class ToyClass
{
    private String name;
    private int number;
    public ToyClass(String initialName, int initialNumber)
    {
    name = initialName;
    number = initialNumber;
    }
    public ToyClass()
    {
        name = "No name yet.";
        number = 0;
    
    }
   
    public void set(String newName, int newNumber)
    {
    name = newName;
    number = newNumber;
    
    }
   
    public String toString()
    {
        return (name + " " + number);
    }
    public static void changer(ToyClass aParameter)
    {
        aParameter.name = "Hot Shot";
        aParameter.number = 42;
    }
    
    public static void main(String [] args){
        ToyClass obj1= new ToyClass(),
                 obj2= new ToyClass();
        obj1.set("Scorpius", 1);
        obj2.set("John Crichton", 2);

        ToyClass variable1 = new ToyClass("Chiana", 3),
                 variable2 = new ToyClass("Chiana", 3);


        /**ToyClass anObject = null ;
            anObject.set("Josephine", 42);*/
                 
        System.out.println( "Comparing Using Equals Operator");
        if(variable1.equals(variable2))
            System.out.println("Equals");
        else{
            System.out.println("Not Equals");
        }
        System.out.println( "Comparing Using Equals ==");           

        if(variable1==variable2)
            System.out.println("Equals");
        else
            System.out.println("Not Equals");


    }
    
}
