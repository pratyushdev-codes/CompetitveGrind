import java.util.*;;
public class ordinaryNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int res =0;

            for(long pow = 1; pow <= N ; pow= (pow*10)+1){
                for(int d = 1 ; d<=9 ; d++){
                    if(pow*d<=N){
                        res++;
                    }
                    }
                }
                            System.out.println(res);
            }

        }
    }

