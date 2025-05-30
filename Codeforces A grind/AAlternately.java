import java.util.Scanner;

public class AAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        String s = sc.nextLine();
        
        boolean isAlternating = true;
        
        // Check if any two adjacent characters are the same
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                isAlternating = false;
                break;
            }
        }
        
        if(isAlternating){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}