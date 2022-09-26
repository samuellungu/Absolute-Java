public class Palindrome {
    public static void main(String [] args){
        String test1="MALAYALAM";
        boolean isPalindrome=true;

        for (int i =0;i < test1.length()/2;i++){
            if(test1.charAt(i)!=test1.charAt(test1.length()-1-i)){
                isPalindrome=false;
                break;
            }
            else isPalindrome=true;
        }
        System.out.println("That The word "+test1+" Is a Palindrome is : " +isPalindrome);

        
    }
}
