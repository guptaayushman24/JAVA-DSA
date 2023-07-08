import java.util.*;
public class Swap_two_Nibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int newnum;
        newnum = ((num&0x0F)<<4 | (num&0xF0)>>4);

        System.out.println("Before Swapping " + num);
        System.out.println("After Swapping " + newnum);
    }
}
