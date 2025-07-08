import java.util.*;

public class MochaRedandBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline after reading t
        
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine(); // consume the newline after reading n
            String squares = sc.nextLine();
            
            // Convert string to character array for modification
            char[] arr = squares.toCharArray();
            
            // Forward pass: handle '?' characters from left to right
            for(int i = 0; i < n; i++){
                if(arr[i] == '?'){
                    if(i == 0){
                        // First position, we can choose any color
                        arr[i] = 'B';
                    } else {
                        // Choose opposite color of previous character
                        if(arr[i-1] == 'B'){
                            arr[i] = 'R';
                        } else {
                            arr[i] = 'B';
                        }
                    }
                }
            }
            
            // Print the result
            System.out.println(new String(arr));
        }
        
        sc.close();
    }
}