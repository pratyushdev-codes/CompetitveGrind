import java.util.Scanner;



// Case 1: x % k != 0 → output 1 move → just [x].

// Case 2: x % k == 0 → output 2 moves → [1, x-1].


public class GrassHopperALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int k = sc.nextInt();
            
            if(x%k==0){
                  // Case 2: need 2 moves
                System.out.println(2);
                System.out.println(1 + " "+ (x-1));
            }else{
                System.out.println(1);
                System.out.println(x);
            }
        }
    }
}
