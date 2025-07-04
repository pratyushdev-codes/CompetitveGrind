// import java.util.Scanner;

// public class yetAnotherTwoIntegers {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int a= sc.nextInt();
//             int b = sc.nextInt();

//             int maxI = Math.max(a,b);
//             int minI = Math.min(a,b);

//           int diff = Math.abs(maxI- minI);
//           int rem = diff/10;
//           if(rem%10==0){
//             System.out.println(rem);
//           }else{
//             System.out.println(rem+1);
//           }
//         }
//         sc.close();
//     }



// }
import java.util.Scanner;

public class yetAnotherTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int diff = Math.abs(a - b);
            
            // Calculate minimum moves using ceiling division
            int moves = (diff + 9) / 10;
            
            System.out.println(moves);
        }
        sc.close();
    }
}