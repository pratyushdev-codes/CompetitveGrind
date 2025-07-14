import java.util.Scanner;

public class prependandAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            int j = s.length()-1;
     
            while(i < j && ((s.charAt(i)=='0' && s.charAt(j)=='1') || (s.charAt(i)=='1' && s.charAt(j)=='0'))){
                i++;
                j--;
            }
            
      
            System.out.println(Math.max(0, j-i+1));
        }
    }
}