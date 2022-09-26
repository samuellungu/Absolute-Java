public class SelectionSort {
    public static void sort(double []a, int numberUsed){
        int index, indexOfNextSmallest;
        for(index=0;index < numberUsed-1;index++){
            indexOfNextSmallest=indexOfSmallest(index, a, numberUsed);
            interchange(index, indexOfNextSmallest, a);
        }

    }
    public static int indexOfSmallest(int startIndex, double [] a, int numberUsed){
        double min = a[startIndex];
        int indexOfMin = startIndex;
        int index;

        for(index = startIndex +1;index < numberUsed; index ++){
            if(a[index] < min){
                min = a[index];
                indexOfMin=index;
            }

        }
        return indexOfMin;
    }
    private static void interchange(int i, int j, double [] a){
        double temp;
        temp = a[i];
        a[i] = a [j];
        a[j] = temp;
    }
    public static void main (String [] args){
        
        double [] b ={7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42};
        System.out.println("Array contents before sorting:");  
        int i;
        for (i = 0; i < b.length; i++) 
            System.out.print(b[i] + " ");
        System.out.println();
        SelectionSort.sort(b, b.length);

        System.out.println("Sorted array values:");
        for (i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

    }
}
