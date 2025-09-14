import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i =0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int maxLength =0;
            for(int i =0 ; i < n ; i++){
                if(arr[i]!=1){
                    maxLength++;

                }else{
                    maxLength=0;
                }

            }
        }
    }
}
