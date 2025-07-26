import java.util.HashSet;
import java.util.Scanner;

public class ValleriAgainstEveryOne {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i < n ; i++){
            
                    set.add(arr[i]);
                }


            if(set.size()<n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            
            }
        }
}

}