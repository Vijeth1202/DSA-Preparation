import java.util.*;
public class KthSamll{
	public static void main(String[] args) {
			int arr[]= {7, 10, 4, 3, 20, 15};
			int k=3;
			  int n=arr.length-1;
		        Arrays.sort(arr);// Or use quick sort or any sorting methods
		         
		        System.out.println( arr[n-k]);
		    }

}



