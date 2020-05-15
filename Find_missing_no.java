package arrays_interviewQues;

public class Find_missing_no {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,4,7,6,5};
//	    Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int arr[]=new int[n];
		int xor1=arr[0];
		int xor2=1;
//		for(int i=0;i<=n;i++)
//		{
//			arr[i]=s.nextInt();
//		}
		for(int i=0;i<arr.length;i++)
		{
			xor1=xor1^arr[i];
		}
		for(int i=0;i<=arr.length+1;i++)
		{
			xor2=xor2^i;
		}
	System.out.println("Missing no is :" + (xor1^xor2));
    
	}

}
