package com.program.java;

import java.util.Scanner;

public class NoOfWordsSentence {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a line:");
		String str=scn.nextLine();
		String words[]=str.split(" ");
		int count=words.length;
		System.out.println("no. of words ="+count);

	}

}
