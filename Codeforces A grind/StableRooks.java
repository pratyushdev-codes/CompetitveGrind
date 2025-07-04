import java.util.*;

public class StableRooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            // Check if stable arrangement is possible
            if (k > (n + 1) / 2) {
                System.out.println(-1);
                continue;
            }
            
            // Create the board
            char[][] board = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }
            
            // Place rooks on main diagonal with spacing of 2
            int placed = 0;
            for (int i = 0; i < n && placed < k; i += 2) {
                board[i][i] = 'R';
                placed++;
            }
            
            // Print the board
            for (int i = 0; i < n; i++) {
                System.out.println(new String(board[i]));
            }
        }
        
        sc.close();
    }
}