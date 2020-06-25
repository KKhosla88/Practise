package arrays_interviewQues;

public class Move_ZeroestoEnd 
{
	 static void Zeroes(int arr[],int n)
	{
		 int count=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]>0)
	            {
	                arr[count++]=arr[i];
	            }
	        }
	        while(count<arr.length)
	        {
	            arr[count++]=0;      
	       }
	}

	public static void main(String[] args) 
	{
		int arr[]= {2,3,0,9,40,4,0,12,0,0,0};
		int n=arr.length;
		Zeroes(arr,n);
		System.out.println("Array after pushing 0s to end:");
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
		 
	}

}
