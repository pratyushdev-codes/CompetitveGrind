import java.util.*;

public class fiarCandyDistribution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

       List<long []> arr = new ArrayList<>();

       for(int i =0 ; i < N ; i++){
            long val  = sc.nextLong();
            arr.add(new long[]{val, i}); // storing the input it the form of element and index
       }
       arr.sort(Comparator.comparingLong(a->a[0]));


       int base = (int )(K/N); // these will bee the minimum no of candies that will be distributed to at least everyone
       List<Long> ans = new ArrayList<>(Collections.nCopies((int)N, (long)base));
       long left = K- (K/N)*N;

       for(int i = 0 ; i < left; i++){

        int index = (int) arr.get(i)[1];
        ans.set(index, ans.get(index)+1);
       }
       for(long X : ans){System.out.println(X);}
    }
}
