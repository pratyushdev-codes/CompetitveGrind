import java.util.Scanner;

public class MakeitIncreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int[n];
            for(int i =0; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int ans =0;
            for(int i = (int)n-2; i>=0; i--){
                while(arr[i]>=arr[i+1]){
                    ans++;
                    arr[i]/=2;

                    if(arr[i]==0)  break;
                }
                if(arr[i]==0 && arr[i+1]==0){
                    ans =-1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
