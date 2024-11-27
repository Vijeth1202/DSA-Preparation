import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
           long totalSum = arr.stream().mapToLong(Integer::longValue).sum();

       
        int minElement = Collections.min(arr);
        int maxElement = Collections.max(arr);

        
        long minSum = totalSum - maxElement; // Exclude max
        long maxSum = totalSum - minElement; // Exclude min

        
        System.out.println(minSum + " " + maxSum);
    }

}
