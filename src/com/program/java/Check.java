package com.program.java;
interface I1
{
	default void show()
	{
		System.out.println("I1");
	}
}
class A
{
	public void show()
	{
		System.out.println("A");
	}
}
public class Check extends A implements I1
{

	public static void main(String[] args)
	{
		I1 t=new Check();
		t.show();



	}

}
