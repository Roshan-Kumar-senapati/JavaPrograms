package com.program.java;

import java.util.Scanner;

public class AllSubString {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scn.nextLine();
		String sub;
		scn.close();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=str.length()-i;j++)
			{
				sub=str.substring(i,i+j);
				System.out.println("Substrings are="+sub);
			}
		}

	}

}
