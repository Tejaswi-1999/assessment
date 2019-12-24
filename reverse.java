package deloitte;

import java.util.Scanner;

public class reverse {


	public static void main(String args[])
	{
		int c=0;int count = 0;char s[1000];
		System.out.println("enter string to reverse:");
		Scanner read=new Scanner(System.in);
		String str="java";
		char reverse;
		for(int i=str.length()-1;i>=0;i--)
		{
	       reverse=reverse+str.charAt(i);
		}
		System.out.println("reversed string is:");
		System.out.println(reverse);
		gets(s);
		printf("no,of vowels in a string:%d",count);
		return 0;
		
	
		
		
	}
	

}
