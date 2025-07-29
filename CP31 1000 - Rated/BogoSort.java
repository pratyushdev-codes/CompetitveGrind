import java.util.*;

public class BogoSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i =0 ;i < n ; i++){
                list.add(sc.nextInt());
            }

            list.sort(Collections.reverseOrder());

            for(int i  : list){
                System.out.println(i+ " ");
        }
         System.out.println();
    }
}

}