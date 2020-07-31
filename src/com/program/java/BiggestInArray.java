package com.program.java;

import java.util.Scanner;

public class BiggestInArray
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s=scn.nextInt();
		int [] arr=new int[s];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<=s-1;i++)
		{
			arr[i]=scn.nextInt();
		
		}
		int bigger=arr[0];
		for(int i=0;i<s;i++)
		{
			if(bigger<arr[i]) {
				bigger=arr[i];
				}
		}
		System.out.println(bigger);

	}

}
