package arrays_interviewQues;

public class Pairs_EqualSUM_BruteForce {

	public static void main(String[] args) 
	{
		int arr[]= {2,9,3,-5,11,-7,10,12};
		int n=5;
		System.out.println("Pairs are: ");
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			int first=arr[i];
			for(int j=i+1;j<len;j++)
			{
				int second=arr[j];
				if((first+second)==n)
				{
				System.out.println(first+","+second);
				}
			}
		}
	}

}
