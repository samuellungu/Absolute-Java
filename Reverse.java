public class Reverse {
    public static void main(String [] args){
        String st="hello";

        String st_reversed="";

        for(int i=0;i<st.length();i++){
            st_reversed=st_reversed+st.charAt(st.length()-1-i);
        }
        System.out.println(st_reversed);
    }
}
