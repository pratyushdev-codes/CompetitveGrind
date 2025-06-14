import java.util.*;
public class print1toN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        printtoN(1, n);

    }public static void printtoN(int current,int n){
        if(current<n){
            printtoN(current+1,n);
            System.out.println(current + " ");
        }
    }
}
