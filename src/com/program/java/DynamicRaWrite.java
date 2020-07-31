package com.program.java;

import java.util.Scanner;

public class DynamicRaWrite {

	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the size:");
		int s=scn.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter the array elements");
		for(int i=0;i<=s-1;i++)
		{
			arr[i]=scn.nextInt();
		}
		scn.close();
		System.out.println("Array elements are:");
		for(int m:arr)
		{
			System.out.print(" "+m);
		}

	}

}
