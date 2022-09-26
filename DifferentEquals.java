public class DifferentEquals
{
      public static void main(String[] args)
      {
           int[] c = new int[10];
           int[] d = new int[10];
          int i;
          for (i = 0; i < c.length; i++)
              c[i] = i;
          for (i = 0; i < d.length; i++)
              d[i] = i;
          if  (c == d)
              System.out.println("c and d are equal by ==.");
          else
              System.out.println("c and d are not equal by ==.");
          System.out.println("== only tests memory addresses.");

          if (equalArrays(c, d))
              System.out.println(
                     "c and d are equal by the equalArrays method.");
          else
              System.out.println(
                     "c and d are not equal by the equalArrays method.");

           System.out.println(
                  "An equalArrays method is usually a more useful test.");
      }

    private static boolean equalArrays(int[] c, int[] d) {
        if(c.length!=d.length){
            return false;

        }
        else{
            int i=0;
            while(i<c.length && i<d.length){
                if(c[i]!=d[i])
                return false;
                i++;
            }
        }
        return true;
    }
}


      