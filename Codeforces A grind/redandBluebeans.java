import java.util.Scanner;

public class redandBluebeans {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int r= sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            
            int maxi = Math.max(r, b);
            int mini = Math.min(r, b);
            
            int res = maxi/mini;
            if(maxi%mini!=0){
                res++;
            }

            int x = res-1;

            if(x<=d){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            }
        }
    }
