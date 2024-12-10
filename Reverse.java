

public class Reverse {
	
	public static int[] reverseArr(int arr[],int n)
	{
		int reversearr[] = new int[arr.length];
		n=n%arr.length;
		
		for (int i = 0; i < n; i++) {
			reversearr[i]=arr[arr.length-n+i];
			
		}
		
		
		for (int i = n,j=0;  i < arr.length;i++,j++)
		{
			reversearr[i]=arr[j];
			
		}
		System.out.println();
		return reversearr;
	}

	public static void main(String[] args) {
		int arr[]= {1,3,5,2,7,8};
		arr=reverseArr(arr,4);
		for(int i:arr)
			System.out.print(i+ " ");

	}

}
