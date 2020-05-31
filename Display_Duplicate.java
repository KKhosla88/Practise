package arrays_interviewQues;

public class Display_Duplicate {

	public static void main(String[] args) 
	{
		int arr[]= {2,5,9,8,5,2,25,23,57,8};
		System.out.print("Duplicate Values: ");
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				
					System.out.print(arr[j]+",");
			}
		}
	}

}
