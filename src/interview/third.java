package interview;

import java.util.Arrays;

public class third
	{
	 public static void main(String [] args)
	{
	int a[]={20,10,30,40};

	Arrays.sort(a); //10,20,30,40
System.out.println("========================");
	//for ascending order
	for(int i=0; i<=a.length-1;i++)//3
	{
	System.out.println(a[i]);//10,20,30,40
	}
	System.out.println("========================");
	//descending order

	for(int i=a.length-1;i>=0;i--)//0>0
	{
	System.out.println(a[i]);//40,30,20,10
	}
	}
}
