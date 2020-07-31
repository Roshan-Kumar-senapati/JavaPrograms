package com.program.java;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		String[] sarr=s.split(" ");
		String temp=sarr[sarr.length-1];
		for(int i=sarr.length-2;i>=0;i--)
		{
			temp=temp+" "+sarr[i];
		}
		System.out.print(temp);

	}

}
