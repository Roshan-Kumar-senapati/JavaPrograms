package com.program.java;

import java.util.Scanner;

public class CheckPallindrome 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String:");
		String org=scn.nextLine();
		String rev="";
		scn.close();
		for(int i=org.length()-1;i>=0;i--)
		{
			rev+=org.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("it is a pallindrome");
		}
		else
		{
			System.out.println(" it is not a pallindrome");
		}

	}

}
