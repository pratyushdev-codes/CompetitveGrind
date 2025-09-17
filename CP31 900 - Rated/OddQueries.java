import java.util.Scanner;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            long [] arr= new long[n];
            for(int i =0; i < n ; i++){
               arr[i] = sc.nextInt(); 
        }

        long [] prefixSum = new long[n+1];

        for(int i =1; i <=n ; i++){
            prefixSum[i] = arr[i-1] + prefixSum[i-1];
        }

        long totalSum = prefixSum[n]; //total Original Sum of the array

        while(q-->0){
            int l = sc.nextInt();
            int r= sc.nextInt();
            int k = sc.nextInt();


            long sumToremove = prefixSum[r] - prefixSum[l-1];
            long sumToadd = (long)(r-l+1)*k;
            long newSum = totalSum - sumToremove + sumToadd;


            if(newSum%2==0){
                System.out.println("YES\n");
            }else{
                System.out.println("NO\n");
            }
        }




    }
}


}
