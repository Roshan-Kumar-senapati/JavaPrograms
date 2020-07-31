package com.program.java;

import java.util.Scanner;

public class OccuranceofCharacter
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a line:");
		String str=scn.nextLine();
		System.out.println("Enter a Character:");
		char c=scn.next().charAt(0);
		char strarr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<strarr.length;i++)
		{
			if(strarr[i]==c)
			{
				count++;
			}
		}
		System.out.println("\n no.of occurance found="+count);
	}

}
