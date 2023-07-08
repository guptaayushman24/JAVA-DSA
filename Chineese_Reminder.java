import java.util.*;
public class Chineese_Reminder {
    public static int reminder(int num[],int rem[],int k){ // k is the size of the array
        int x = 1; // Initializing output as 1 by default
        while (true){
            int i=0;
            for (i=0;i<k;i++){
                if (x%num[i]!=rem[i]){
                    break;
                }
            }


                if (i==k){
                    return x;
                }

                else{

                    x++;
                }



        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        int [] num = new int[k];
        int [] rem = new int[k];
        for (int i=0;i<k;i++){
            num[i] = sc.nextInt();
        }
        for (int i=0;i<k;i++){
            rem[i] = sc.nextInt();
        }
        System.out.println(reminder(num, rem, k));

    }
}
