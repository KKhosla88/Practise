package java_Interview_Ques;

import java.util.Arrays;

public class Anagram {

	public static void isAnagram(String str1,String str2)
	{
		String s1=str1.replaceAll("\\s", "");
	    String s2=str2.replaceAll("\\s", "");
	    boolean status=true;
	    if(s1.length()!=s2.length())
	    {
	    	status=false;
	    }
	    else
	    {
	    	char []Array1=s1.toLowerCase().toCharArray();
	    	char []Array2=s2.toLowerCase().toCharArray();
	    	Arrays.sort(Array1);
	    	Arrays.sort(Array2);
	    	status=Arrays.equals(Array1,Array2);
	    }
	    if(status)
	    {
	    	System.out.println(s1+" and "+ s2 +" are Anagrams");
	    }
	    else
	    {
	    	System.out.println(s1+ " and "+ s2 +" are Not Anagrams");
	    }
	}
	public static void main(String[] args) 
	{
		isAnagram("keep","peek");
		isAnagram("this is","is it");
	}

}
