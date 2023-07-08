import java.util.*;
public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.next();

        printMyName(name); // Calling the function here
    }
}

// Static Method can be called directly
// Non static Method cannot be called directly you have to create the object of the
