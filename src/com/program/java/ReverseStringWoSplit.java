package com.program.java;

import java.util.Scanner;

public class ReverseStringWoSplit 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.nextLine();
		char [] charr=s.toCharArray();
		int sp=0;
		for(int i=0;i<charr.length;i++)
		{
			if(charr[i]==' ')
			{
				sp++;
			}
		}
		String[] arr=new String[sp+1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			String temp="";
			while(i<charr.length)
			{
				
			}
		}
	}

}
