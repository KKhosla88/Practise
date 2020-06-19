package arrays_interviewQues;

public class Min_numberNoSubset 
{
	public int find(int arr[])
	{
		int small=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=small)
			{
				small+=arr[i];
			}
			else
				break;
			
		}
		return small;
	}

	public static void main(String[] args) 
	{
		Min_numberNoSubset m=new Min_numberNoSubset ();
		System.out.println("Smallest integers that canot be represented by any subset are: ");
		int arr1[]= {1,1,3,4,6,7,9};
		System.out.println("{1,1,3,4,6,7,9} ->"+m.find(arr1));
		int arr2[]= {2,3,6,7};
		System.out.println("{2,3,6,7} ->"+m.find(arr2));
		
	}

}
