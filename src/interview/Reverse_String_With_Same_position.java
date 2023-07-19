package interview;

public class Reverse_String_With_Same_position 
{
public static void main(String[] args) {
	String s1="java program";
	String rev1="";
	String rev2="";
	for(int i=3;i>=0;i--)
	{
		rev1=rev1+s1.charAt(i);
	}
	System.out.print(rev1+" ");
	for(int j=11;j>=5;j--)
		
	{
		rev2=rev2+s1.charAt(j);
	}
	System.out.print(rev2);
}
}
