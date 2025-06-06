import java.util.*;

public class WhosOpposite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int totalPersons = 2 * Math.abs(a - b);

            if(a > totalPersons || b > totalPersons || c > totalPersons){
                System.out.println(-1);
            } else {
                int opposite = c + totalPersons / 2;
                if (opposite > totalPersons) {
                    opposite -= totalPersons;
                }
                System.out.println(opposite);
            }
        }
        sc.close();
    }
}
