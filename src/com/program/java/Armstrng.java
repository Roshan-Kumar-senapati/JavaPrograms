package com.program.java;

import java.util.Scanner;

public class Armstrng
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a number");
		int org=scn.nextInt();
		scn.close();
		int res=0;
		int dup=org;
		while(dup!=0)
		{
			int rem=dup%10;
			dup=dup/10;
			res=res+(rem*rem*rem);
		}
		if(org==res)System.out.println("Armstrong number");
		else System.out.println("not a armstrong number");
		

	}

}
