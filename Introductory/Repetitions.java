import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

    //     HashMap<Character, Integer> map = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         map.put(ch, map.getOrDefault(ch, 0) + 1);
    //     }

    //     int maxCount = 0;
    //     for (int count : map.values()) {
    //         maxCount = Math.max(maxCount, count);
    //     }

    //     System.out.println("Maximum repetition count: " + maxCount);
    // }

int currCount =1;
int maxCount =1;
for(int i =1 ;i< s.length(); i++){
    if(s.charAt(i)==s.charAt(i-1)){
        currCount++;
       
    }else{
        currCount=1;
      
    }
    maxCount= Math.max(maxCount, currCount);
}
System.out.println(maxCount); 
    }
}
