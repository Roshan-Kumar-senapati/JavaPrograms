package com.program.java;

import java.util.Scanner;

public class CountNoOfPunctuation {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a line:");
		String Str=scn.nextLine();
		scn.close();
		
		int punct=0,letters=0,spaces=0,number=0;
		for(int i=0;i<Str.length();i++)
		{
			char c=Str.charAt(i);
			if(c>='A'&&c<='Z'||c>='a'&&c<='z')
			{
				letters++;
			}
			else if(c==' '||c=='\t')
			{
				spaces++;
			}
			else if(c>='0'&&c<='9')
			{
				number++;
			}
			else
			{
				punct++;
			}
		}
		System.out.println("No.of characters="+letters);
		System.out.println("No. of spaces="+spaces);
		System.out.println("No. of punctuations are="+punct);
		System.out.println("No. of numbers are"+number);
		
	}

}
