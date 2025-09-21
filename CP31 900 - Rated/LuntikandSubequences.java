import java.util.Scanner;

public class LuntikandSubequences {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for(int i =0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int one_count =0;
            int zero_count=0;

            for(int i =0 ; i < n ; i++){
                if(arr[i]==1){
                    one_count++;
                }else{
                    zero_count++;
                }
            }

            long ans = (1<<zero_count)*one_count;
            System.out.println(ans);
        }

    }
}
