package arrays_interviewQues;

public class Common_from3Sorted_Arrays {
	
		
	public static void main(String[] args) 
	{
		int arr1[] = {1, 5, 10, 20, 40, 80}; 
        int arr2[] = {6, 7, 20, 80, 100}; 
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        
        int i=0,j=0,k=0;
        System.out.print("Common Elements: ");
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j]) 
				i++;
			
			else if(arr2[j]<arr3[k])
			   j++;
			else
				k++;
			
		}
	      
        
	}

}