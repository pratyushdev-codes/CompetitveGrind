import java.util.Scanner;



public class PeakElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [ ]=  new int [n];
            for(int i=0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            if(n==0) {
                System.out.println("NO");
            }
            if(n==1){
                System.out.println("YES");
            }
            int low =0;
            int high = n-1;
            while(low<=high){
                int mid = low + (high -low)/2;

                boolean leftOk = (mid==0) || arr[mid]>=arr[mid+1];
                boolean rightOk = (mid==n-1) || arr[mid]>=arr[mid=1];


                if(leftOk && rightOk){
                    System.out.println("YES");
                }
                // Move towards bigger neighbor
                if(mid>0 && arr[mid-1]> arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }

        }
        System.out.println("NO");

    }
}
