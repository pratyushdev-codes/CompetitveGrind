import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shoeshuffling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
           long[] sizes = new long[n];
            for (int i = 0; i < n; i++) {
                sizes[i] = sc.nextLong();
            }

            HashMap<Long, Long> freqMap = new HashMap<>();

            for(int i =0 ; i < n ; i++){
                freqMap.put(sizes[i], freqMap.getOrDefault(sizes[i], 0L)+1);
            }
                boolean flag = false;
            for(Map<Long,Long> entry : freqMap.entrySet()){
                if(entry.getValue()==1){
                    flag= true;
                    break;
                }
            }
            // this is because unique shoes pair sizes cant be shuffled as it wont satisfy the second condition.
            if(flag){
                System.out.println(-1);
                continue;
            }

            long [] students = new long[n];
            for(int i=0; i<n ; i++){
                students[i] = i+1;
            }

            int l = 0 , r =0;

            while(r<n){
                if(sizes[l]==sizes[r]){
                    r++;
                }else{
                    rotate(students, l ,r );
                    l=r;
                }
            }
            rotate(students, l ,r);
        }
    }
}



// for (Map.Entry<Long, Long> entry : freq.entrySet()) {
//     if (entry.getValue() == 1) {
//         flag = true;
//         break;
//     }
// }
// Breakdown:
// freq.entrySet():

// freq is a HashMap<Long, Long> that stores the frequency count of each element.

// entrySet() returns a set view of the mappings (key-value pairs) in the map.

// Map.Entry<Long, Long> entry:

// Each entry represents one key-value pair in the map.

// entry.getKey() would give the element (number from the input).

// entry.getValue() gives the frequency count of that element.

// if (entry.getValue() == 1):

// Checks if the current element (entry) has a frequency count of 1.

// If true, it means this element appears only once in the entire input array.

// flag = true; break;:

// Sets flag to true to indicate that at least one element with frequency 1 was found.

// break exits the loop immediately since we don't need to check further once we find such an element.