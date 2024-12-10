import java.util.*;
public class MaxSubarray {
	    public static  int maxSubArray(int[] nums) {
	        int max = nums[0];

	        int currMax = 0;
	        for (int i = 0; i < nums.length; i++) {
	            currMax += nums[i];
	            max = max < currMax ? currMax : max;
	            if (currMax < 0) {
	                currMax = 0;
	            }
	            
	        }

	        return max;
	    }
	

	public static void main(String[] args) {
		int arr[]= {4,-5,2,9,5,1,-3};
		System.out.println(" Maximum sub-array sum is:" + maxSubArray(arr));
	}

}
