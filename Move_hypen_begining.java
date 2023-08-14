import java.util.*;

public class Move_hypen_begining {
    public static void main(String[] args) {
        char str[] = "Code- 4 -lyf".toCharArray();

        ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> hyphens = new ArrayList<>();

        for (char c : str) {
            if (c == '-') {
                hyphens.add(c);
            } else {
                al.add(c);
            }
        }

        al.addAll(0, hyphens);

        char modifiedStr[] = new char[al.size()];
        for (int i = 0; i < al.size(); i++) {
            modifiedStr[i] = al.get(i);
        }

        System.out.println(String.valueOf(modifiedStr));
    }
}
