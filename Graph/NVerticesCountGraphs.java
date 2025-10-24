
    // Java implementation of the approach 
class NVerticesCountGraphs 
{
    static final int MOD = (int)1e9 + 7; 
    
    // Function to return (x^y) % MOD 
    // in O(log(y)) 
    static long power(long x, 
                      long y)
    { 
        long res = 1; 
        while (y > 0) 
        { 
            if ((y & 1) != 0) 
                res = (res * x) % MOD; 
            x = (x * x) % MOD; 
            y /= 2; 
        } 
        return res; 
    } 
    
    // Function to return the count of distinct 
    // graphs possible with n vertices 
    static long countGraphs(int n) 
    { 
    
        // Maximum number of edges for a 
        // graph with n vertices 
        long x = n * (n - 1) / 2; 
    
        // Function to calculate 
        // (2^x) % mod 
        return power(2, x); 
    } 
    
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 5; 
    
        System.out.println(countGraphs(n)); 
    }
}



