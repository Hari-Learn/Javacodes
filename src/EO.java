import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EO {
    public static void findEvenorOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        //String result = ((n%2==0) ? "Evens" :  "Odds");
       // System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Gotcha");
        int n = in.nextInt();
        findEvenorOdd(n);
    }
}
