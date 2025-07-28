import java.util.*;

public class moveBrackets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            String s = sc.next();
            long sum =0;
            long ops = 0;
            for(int i =0 ; i < n ; i++){
                if(s.charAt(i)==')'){
                    sum--;
                }else{
                    sum++;
                }

                if(sum<0){
                    ops++;
                    sum=0;
                }
            }
        System.out.println(ops);

    }
}

}
