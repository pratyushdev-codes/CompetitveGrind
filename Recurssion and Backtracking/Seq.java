
import java.util.*;;
public class Seq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);



            int n = sc.nextInt();

        System.out.println(helperFunc(n));
        

  
    }public static int helperFunc(int n ){
        if(n==1){
            return 1;
        }
        if((n%2)==0){
            return 1 + helperFunc(n/2);
        }else{
            return 1 + helperFunc((3*n)+1);
        }
    }
}
