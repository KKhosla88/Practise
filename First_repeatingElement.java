package arrays_interviewQues;
import java.util.HashSet;
public class First_repeatingElement 
{
	static void Repeating(int arr[])
	{
		int min=-1;
		HashSet<Integer> hs=new HashSet<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(hs.contains(arr[i]))
			{
				min=i;
			}
			else
				hs.add(arr[i]);
		}
			if(min!=-1)
				System.out.println("First repeating elemnt is: "+arr[min]);
			else
				System.out.println("No repeting Element");
		
		
	}

	public static void main(String[] args) 
	{
		int arr[]= {10,5,3,4,3,5,6};
		Repeating(arr);
		
	}

}
