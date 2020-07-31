package com.program.java;

import java.util.Scanner;

public class SecondlargestArray {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=scn.nextInt();
		System.out.println("Enter the no.:");
		
		int arr[]=new int[s];
		for(int i=0;i<s;i++)
		{
			arr[i]=scn.nextInt();
		}
		scn.close();
		int big=arr[0];
		int sbig=0;
		for(int i=0;i<s;i++)
		{
			if(big<arr[i])
			{
				sbig=big;
				big=arr[i];
			}
			else if(sbig<arr[i] && arr[i]!=big)
			{
				sbig=arr[i];
			}
		}
		System.out.println("second largest no.: "+sbig);
	}

}
