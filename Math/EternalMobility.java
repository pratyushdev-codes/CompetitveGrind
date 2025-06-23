import java.util.Scanner;

public class EternalMobility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 1;
        for (int i = b; i >= Math.max(Math.max(a + 1, b - 5), 1); i--) {
            ans = (ans * i) % 10;
        }

        System.out.println(ans);
        sc.close(); 
    }
}
