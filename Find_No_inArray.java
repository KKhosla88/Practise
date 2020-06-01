package arrays_interviewQues;

public class Find_No_inArray {
	//This program is for unsorted Array

	public static void main(String[] args)
	{
		int arr[]= {5,3,8,1,2};
		int find=1;
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(i==find)
				
				found=true;
			//break;
		}
		if(found)
			System.out.println(find+" is found");
		else
			System.out.println(find+" Not found");
	}

}
