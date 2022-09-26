public class InvocationCounter {
    private static int numberOfInvocations=0;

    public void demoMethod(){
        numberOfInvocations++;
    }
    public void outPutCount(){
        numberOfInvocations++;
        System.out.println("Number of invocations so far = "+numberOfInvocations);
    }
    public static int numberSoFar(){
        numberOfInvocations++;
        return numberOfInvocations;
    }
    public static void main(String [] args){
        int i;
        InvocationCounter obj1= new InvocationCounter();

        for(i=1;i<=5;i++){
            obj1.demoMethod();
        obj1.outPutCount();

        }
        InvocationCounter obj2= new InvocationCounter();
        System.out.println();
        System.out.println("Second Object Invocations");
        for(i=1;i<=5;i++){
            obj2.demoMethod();
            obj2.outPutCount();
        }
        System.out.println("Total Number of invocations = "+numberSoFar());
    }
}
