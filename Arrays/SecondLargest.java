package Arrays;
public class SecondLargest 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 5, 22, 8, 35, 15};
		int largest=arr[0];
		int second_largest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]>second_largest && arr[i]!=largest)
			{
				second_largest=arr[i];
			}
		}
		System.out.println("Second Largest Number is: "+second_largest);
	}
}
//Output: Second Largest Number is: 22