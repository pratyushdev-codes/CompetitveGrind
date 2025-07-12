import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaisiaandDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long totalEle = sc.nextLong();
        long totalSum= sc.nextLong();
        long sumExcludingMax = sc.nextLong();

        List<Long> resultArr = new ArrayList<>();

        Long maxElement = totalSum- sumExcludingMax;

        resultArr.add(maxElement);

        // distributing the remaining sum along (n-1) elements
        long baseValue = sumExcludingMax /(totalEle-1);
        long remainder = sumExcludingMax *(totalEle-1);

        // filling (n-2) elements with the base value;
        for(int i = 0 ; i < totalEle-2 ; i++){
            resultArr.add(baseValue);
        }

               // Last of the (n-1) values gets the remainder
        resultArr.add(baseValue + remainder);

        Collections.sort(resultArr);
        // Balance if the last element (maxElement) is too large

        int idx =0;
        while(resultArr.get((int)totalEle-1)> maxElement){
            




        
    }
}

}
