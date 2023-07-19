package interview;

import java.util.Arrays;

public class arrays {
public static void main(String[] args) {
	int []ar= {1,5,3};
	int sum=0;
	int result=0;
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		result+=ar[i]*ar[i]*ar[i];
		
	}
	System.out.println(result);
	boolean s1 = ar.equals(result);
	if(s1==true)
	{
		System.out.println("armstrong");
	}
}
	
}
