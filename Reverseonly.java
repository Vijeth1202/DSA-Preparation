
public class Reverseonly {

	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
	       
	       for (int i = 0; i < n / 2; i++) {
	           int temp = arr[i];
	           arr[i] = arr[n - i - 1];
	           arr[n - i - 1] = temp;
	       }
		for(int ele:arr)
			System.out.print(" " + ele);
	}

}
