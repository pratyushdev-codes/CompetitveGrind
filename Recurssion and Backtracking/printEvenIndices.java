import java.util.Scanner;

public class printEvenIndices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int A [] = new int [N];
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
        }

        printEven(A, N-1);

    }public static void printEven(int [] A , int idx){
        if(idx < 0){
            return;
        }

        if(idx%2==0){
            System.out.print(A[idx] + " ");
        
           
        }
         printEven(A, idx-1);
    }
}
