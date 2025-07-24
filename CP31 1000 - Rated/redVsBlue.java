import java.util.Scanner;

public class redVsBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            String s = "";
            int length_of_red = r / (b + 1);
            int extra_red = r % (b + 1);
            for (int times = 1; times <= b + 1; times++) // b+1
            {
                for (int i = 0; i < length_of_red; i++) // r/b+1
                    s += 'R';
                if (extra_red > 0)
                {
                    s += 'R';
                    extra_red--;
                }
                if (times != b + 1)
                    s += 'B';
            }
            System.out.println(s);
        }
        sc.close();
    }
}
// tc = O(100)
// sc = O(100)