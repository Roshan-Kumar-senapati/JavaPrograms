package com.program.java;

import java.util.Scanner;

public class SmallestInArray
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size:");
		int s=scn.nextInt();
		System.out.println("Enter the elments");
		int[] arr=new int[s];
		for(int i=0;i<s;i++)
		{
			arr[i]=scn.nextInt();
		}
		scn.close();
		int smallest=arr[0];
		for(int i=0;i<s;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		System.out.println("Smallest number is "+smallest);
		
	

	}

}
