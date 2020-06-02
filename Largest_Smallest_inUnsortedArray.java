package arrays_interviewQues;

public class Largest_Smallest_inUnsortedArray {

	public static void main(String[] args) 
	{
		int arr[]= {18,39,2,8,45,34,72,56,5,11};
		int smallest=arr[0];
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("Largest Number is: "+largest);
		System.out.println("Smallest Number is: "+smallest);
	}

}
