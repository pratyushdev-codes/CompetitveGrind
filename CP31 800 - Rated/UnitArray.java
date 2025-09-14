
import java.util.Scanner;
public class UnitArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i=0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int pos_count=0;
            int neg_count=0;


            for(int i =0; i < n ; i++){
                if(arr[i]>0){
                    pos_count++;
                }else{
                    neg_count++;
                }
            }

            int Ops = 0;
            while(pos_count<neg_count || neg_count%2!=0 ){
                Ops++;
                neg_count--;
                pos_count++;
            }
System.out.println(Ops);

        }
        sc.close();
    }
}
