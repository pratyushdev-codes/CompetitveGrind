import java.util.*;

public class BlackandWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int [] prefix = new int [n+1];
            Arrays.fill(prefix , -1);

            for(int i =0; i< n ; i++){
                char ch = str.charAt(i);
                if(ch =='W'){
                    prefix[i+1] = prefix[i] +1; // maintaining a prefix array which will store how many times W is occuring, 
                }
            }

            int min_cells = Integer.MAX_VALUE;
            // we will travels the whole string in a segments of sizes K and then keep findng the min number of whites occuring in them , the less the number of whites the less the number of conversions required to be done in order to make K conequtive K sequence
            for(int i =0 ; i <=n-k ; i++){
                int diff = prefix[i+k]- prefix[i];
                min_cells = Math.min(min_cells, diff);
                        }
                                System.out.println(min_cells);
        }


    }
}
