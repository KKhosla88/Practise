package arrays_interviewQues;
import java.util.HashSet;
public class Find_Subarray_withsum0 
{
	static boolean subArray(int arr[])
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]==0 || sum==0 || hs.contains(sum))
				return true;
			hs.add(sum);
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[]= {4,2,-3,1,6};
		if(subArray(arr))
		System.out.println("Found Subarray");
		else
			System.out.println("Not found");
	}

}
