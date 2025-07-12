import java.util.*;
public class FollowingDirections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int x = 0, y = 0;
            boolean found = false;
            
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'U'){
                    y++;
                } else if(s.charAt(i) == 'D'){
                    y--;
                } else if(s.charAt(i) == 'L'){
                    x--;
                } else {
                    x++;
                }

                if(x == 1 && y == 1){
                    found = true;
                    break; // Exit the loop for this test case
                }
            }
            
            if(found){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}