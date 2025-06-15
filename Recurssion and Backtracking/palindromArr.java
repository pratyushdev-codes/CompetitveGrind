import java.util.Scanner;

public class palindromArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] =  new int [n];

        for(int i =0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }

        if(checkPalindrome(A, 0, n-1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }public static boolean checkPalindrome(int A [], int left, int right){
       if(left>=right){
            return true;
       }

       if(A[left]!= A[right]){
        return false;
       }

       return checkPalindrome(A, left+1, right+1);
    }
}
