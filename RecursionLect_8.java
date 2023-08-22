import java.util.*;
public class RecursionLect_8 {
    public static void permutation (String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s, up.substring(1));
        }
    }

    public static ArrayList<String> permutationList(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<String>();
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
        String f = p.substring(0, i);
        String s = p.substring(i,p.length());
        ans.addAll(permutationList(f+ch+s, up.substring(1)));
        }
        return ans;

    }
    public static void main(String[] args) {

        permutation("","abc");

        // Same as permuation problem adding the permutation in the list
        System.out.println(permutationList("","abc"));

    }

}
