

public class Palindrome {
	
	public static boolean isPalindrome(String name)
	{
		String newName=name.toUpperCase();
		char[] arr=newName.toCharArray();
		for(int i=0, j=arr.length-1;i<arr.length;i++,j--)
		{
				if(arr[i]!=arr[j])
				{
					  return false;
				}
			
		}
		return true;
	}

	public static void main(String[] args) {
		String name=new String("nitini");
		

		System.out.println(isPalindrome(name));
	}

}
