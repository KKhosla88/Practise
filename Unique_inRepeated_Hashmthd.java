package arrays_interviewQues;
import java.util.HashMap;
public class Unique_inRepeated_Hashmthd 
{
	static int Single(int arr[],int n)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++)
		{
			if(!hm.containsKey(arr[i]))
			{
				sum1+=arr[i];
				hm.put(arr[i],1);
			}
			sum2+=arr[i];
		}
		return (int)(2*(sum1)-sum2);
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,1,8,3,5,5,3,8,7};
		int size=arr.length;
		System.out.println("Unique number: "+Single(arr,size));
	}

}
