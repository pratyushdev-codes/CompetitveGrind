import java.util.Scanner;

public class Zero1Game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int countofOne =0;
            int countOfZero =0;
            for(int i =0 ; i < n; i++){
                if(s.charAt(i)=='0'){
                    countOfZero++;
                }else{
                    countofOne++;
                }
            }
            int Operations = Math.min(countofOne, countOfZero);

            if(Operations%2!=0){
                System.out.println("DA");
            }else{
                System.out.println("NET");
            }
            sc.close();;

        }
    }
}
