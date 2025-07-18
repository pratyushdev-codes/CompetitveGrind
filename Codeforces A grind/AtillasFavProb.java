
import java.util.*;

public class AtillasFavProb {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

      
        while (t-- > 0) {

            int n = sc.nextInt();

     
            String str = sc.next();


            int maxPosition = 0;


            for (char c : str.toCharArray()) {

                int currentPosition = (c - 'a') + 1;

                // Update maxPosition if the current character's position is greater
                // than any we've seen before.
                if (currentPosition > maxPosition) {
                    maxPosition = currentPosition;
                }

            }


            System.out.println(maxPosition);
        }

        sc.close();
    }
}
