import java.util.*;
public class Strobogrammatic_Number{
    public static boolean s_number(String n){
        Map<Character,Character> m = new HashMap<>();
        m.put('0','0');
        m.put('1','1');
        m.put('6','9');
        m.put('8','8');
        m.put('9','6');

        int start=0;
        int end=n.length()-1;
        while (start<end){
            if (n.charAt(start)!=m.getOrDefault((n.charAt(end)),' ')){
                return false;
            }

            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        // Two pointer approach we will apply
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
       System.out.println( s_number(n));


    }
}