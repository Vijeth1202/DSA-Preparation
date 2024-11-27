import java.util.List;

public class DiagonalDifference {
     public static int diagonalDifference(List<List<Integer>> arr) {
            int lsum=0,rsum=0;
            int n=arr.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> row=arr.get(i);
                lsum+=row.get(i);
                rsum+=row.get(n-1-i);
                
            }
        return Math.abs(lsum-rsum);
    }
}
