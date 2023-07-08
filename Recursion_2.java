import java.util.*;
class Recursion_2{

    public static void print_name(int i,int n){
        if (i>n){
            return;
        }
        System.out.println("Ayushman");
        print_name(++i, n);
    }

    public static void print_num(int i,int k){
        if (i>k){
            return;
        }
        System.out.println(i++);

        print_num(i, k);


    }
    public static void  print_rev_num(int i,int z){
        if (i==0){
            return;
        }
        System.out.println(i--);
        print_rev_num(i, z);
    }
    public static void main(String[] args) {

        // Q1:- Printing the name 5 times
        int n=5;
        // print_name(1, 5);

        // Q2:- Printing the nums from 1 to N
        // print_num(1,6);

        // Q3:*- Printing thr nums from N to 1
        print_rev_num(4,4);

    }
}