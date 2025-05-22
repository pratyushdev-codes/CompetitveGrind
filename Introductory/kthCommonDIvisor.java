import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class kthCommonDIvisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        int result = findKHCF(A, B, K);
        System.out.println(result);

}public static int findKHCF(int x, int y, int k) {
    
    // Find smaller of two numbers
    int small = Math.min(x, y);

    // Count common factors until we either
    // reach small or count becomes k.
    int count = 1;
    for (int i = 2; i <= small; i++) {
    if (x % i == 0 && y % i == 0)
        count++;
    if (count == k)
        return i;
    }

    // If we reached small
    return -1;
}

}
