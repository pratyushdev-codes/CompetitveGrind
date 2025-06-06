import java.util.Scanner;

public class BASCIIArt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int mat[][] = new int[H][W];

        // Read the input matrix
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        // Process and print the output directly
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (mat[i][j] == 0) {
                    System.out.print('.');
                } else {
                    // Convert number to corresponding uppercase letter
                    // 1 -> 'A', 2 -> 'B', ..., 26 -> 'Z'
                    char ch = (char)('A' + mat[i][j] - 1);
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}