import java.util.HashMap;
import java.util.Scanner;


public class ArrayReordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.nextLine();

            HashMap<Character, Integer> hm = new HashMap<>();
            for(int i =0 ; i < str.length() ; i++){
                char ch = str.charAt(i);
                hm.put(ch, hm.getOrDefault(hm, 0)+1);
            }
            int count =0;
            for(int freq: hm.values()){
                if(freq>=2){
                        count++;
                }
            }

            if(count>=2){
                System.out.println("YES");
            }else{
                System.out.println("NO" );
            }
    
        }
    }
}
