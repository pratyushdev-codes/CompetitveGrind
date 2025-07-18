import java.util.Scanner;

public class trafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

                long n = sc.nextLong();
                char color = sc.next().charAt(0);
                String s= sc.next();

                // concatenate the string with itself
                s +=s;
                n*=2;

                // as this was a circular String

                long lastGeenIdx =-1;
                long maxSeconds = Integer.MIN_VALUE;
                for(int i = (int)n-1; i>=0 ; i--){
                    if(s.charAt(i)=='g'){
                        lastGeenIdx=i;
                    }

                    if(s.charAt(i)==color){
                        long difference = lastGeenIdx - i;
                        maxSeconds = Math.max(maxSeconds, difference);
                    }
                }

                System.out.println(maxSeconds);


        }
        sc.close();
    }
}
