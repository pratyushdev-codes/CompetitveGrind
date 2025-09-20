import java.util.Scanner;

public class NIITDetroysuniverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i =0; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            
            int zeroCount=0;
            for(int i =0; i <n ; i++){
                if(arr[i]==0){
                    zeroCount++;
                }
            }
            boolean foundZero= false;
            int left =0;
            int right = n-1;
            
            while(left<n && arr[left]==0){
                left++;
            }

            while(right>=0 && arr[right]==0){
                right--;
            }

            for(int i =left; i<=right; i++){
                if(arr[i]==0){
                    foundZero=true;
                    break;
                }
            }

            if(zeroCount==n){
                System.out.println(0);
            }else if(!foundZero){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
    }
}
