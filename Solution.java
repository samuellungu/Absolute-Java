import java.util.Scanner;
//import java.util.Arrays;

public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        boolean [][] arr=new boolean[m][m];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<m;j++){
                arr[i][j] = prime_cell(i, j) == 1;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static int prime_cell(int a, int b) {
		if (a == 0 || b == 0) {
			return 1;
		}
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a % b == 0) 
		{
			return b;
		} 
		else 
		{
			return prime_cell(b, a % b);
		}
	}
}
