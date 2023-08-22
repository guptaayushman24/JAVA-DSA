import java.util.*;
public class RecursionLect_7 {
    public static void remove_character(String str,int index){
        // Base Condition
        if (index==str.length()){
          return;
        }
        if (str.charAt(index)!='a'){
            System.out.print(str.charAt(index));
        }
        remove_character(str, index+1);

    }

    public static void subseq(String p,String up){
        if (up.isEmpty()){

            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p, up.substring(1));
    }

    public static ArrayList<String> subseqRet(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
         char ch = up.charAt(0);
        ArrayList<String> left= subseqRet(p+ch,up.substring(1));
        ArrayList<String> right=subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void subseqascii(String p,String up){
         if (up.isEmpty()){

            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p, up.substring(1));
        subseq(p+(ch+0), up.substring(1));
    }
    public static void main(String[] args) {

        // Remove the character 'a' from the string

        String str="baccadh";
        int index=0;
        remove_character(str,index);
        System.out.println("");
        // Creating all the subsequence of the string
        subseq("","abc");

        // Adding the subsequence in the array list
        System.out.println(subseqRet("","abc"));

        // Printing the ascii value of the subsequence
        subseqascii("","abc");


    }
}
