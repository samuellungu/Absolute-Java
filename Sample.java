import java.util.Arrays; 
public class Sample {
    private double [] halfArray(double [] arr){
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i]/2;
        }
        return arr;
    }
    public static void main(String [] args){
        double[] a = {1.2, 2.1, 3.3, 2.5, 4.5, 7.9, 5.4, 8.7, 9.9, 1.0};
        Sample s=new Sample();
        System.out.println(Arrays.toString(s.halfArray(a)));
        

    }
    
}
