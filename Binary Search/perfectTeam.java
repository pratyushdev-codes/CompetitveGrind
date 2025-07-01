import java.util.*;
public class perfectTeam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int c = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();


            int maxTeams= Math.min(c, Math.min(m , (c+m+x)/3));
            System.out.println(maxTeams);
        }
    }
}
