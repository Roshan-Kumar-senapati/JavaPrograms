package com.program.java;

import java.util.Scanner;

public class ReversOfString 
{
public static void main(String[] args) 
	{
		String original;
		String reverse="";
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String:");
		original=scn.nextLine();
		scn.close();
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		
System.out.println(reverse);
	}


}
