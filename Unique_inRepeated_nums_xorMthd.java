package arrays_interviewQues;

public class Unique_inRepeated_nums_xorMthd 
{
	static int findSingle(int ar[],int size)
	{
		int temp=ar[0];
		for(int i=1;i<size;i++)
			temp=temp^ar[i];
		return temp;
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,1,8,3,4,5,5,3,4};
		int n=arr.length;
		System.out.println("Unique Element: "+findSingle(arr,n)+" ");
	}

}
