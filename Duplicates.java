import java.util.*;
public class Duplicates {
	
	    public static boolean containsDuplicate(int[] nums) {
	        
	        HashSet<Integer> dup=new HashSet<>();
	        for(int arr:nums)
	        {
	            if(!dup.add(arr))
	                return true;
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		int arr[]= {2,3,5,4,6,4,7,8};
		
		System.out.println(" "+ containsDuplicate(arr));
	}

}
