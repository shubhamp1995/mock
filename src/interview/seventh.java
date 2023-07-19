package interview;

public class seventh {
	public static void main(String[] args) {
		
	
String s1="Sh5ubh3a9m";
int sum=0;//8+9=17
System.out.println(s1.charAt(2));
System.out.println(s1.charAt(6));
System.out.println(s1.charAt(8));
for(int i=0;i<s1.length();i++) 
{
	if(s1.charAt(i)>='0'&& s1.charAt(i)<='9')
	{
		sum=(sum+s1.charAt(i)-'0');
	}
}
	System.out.println(sum);
}
}
