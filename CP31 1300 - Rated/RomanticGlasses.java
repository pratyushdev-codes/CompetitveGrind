import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class RomanticGlasses {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();  
        
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];

            int prefixEven [] = new int [n+1];
            int prefixOdd []= new int [n+1];
            int eveDIFFodd [] = new int [n+1];

            //map for storing eve-odd values between the two prefix arrays
            HashMap<Integer, Integer> hm = new HashMap<>();

            for(int i =0 ; i < n ; i++){import java.util.*;

public class RomanticGlasses {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        long oddSum = 0, evenSum = 0;
        HashSet<Long> seen = new HashSet<>();

        seen.add(0L); // base case: difference 0 at the start
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += v[i];
            } else {
                oddSum += v[i];
            }

            long diff = oddSum - evenSum;

            if (seen.contains(diff)) {
                found = true;
                break;
            }
            seen.add(diff);
        }

        System.out.println(found ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}

            if(i%2==0){
                // for eve cases

                prefixEven[i]= prefixEven[i-1]+ arr[i];
            }else{
                i++;
            }else {
                prefixOdd[i]= prefixOdd[i-1]+ arr[i];
            }
            }

            for(int i =0; i < n ; i++){
                hm.put(i, (prefixEven[i]-prefixOdd[i]));
            }




        }
    }
}
