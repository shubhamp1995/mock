package interview;

public class fourth {
public static void main(String[] args) {
	int star=1;//7
	int spaces=5;//-1
	for(int i=1;i<=6;i++) //1,2,3,4,5,6,7//rows
	{
		for(int k=1;k<=spaces;k++) ////nested or inner for loop spaces
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)//1,2/,3/which for cols
		{
			System.out.print("*");
		}
		System.out.println(" ");
		star=star+2;
		spaces--;//
	}
	System.out.println("-----------------------");
	m1();
			
}
public static  void m1() {
	

    int star=8;
    int spaces=0;
    for(int i=1;i<=8;i++) 
    {
	for(int k=1;k<=spaces;k++) 
	{
		System.out.print(" ");
	}
	for(int j=1;j<=star;j++) {
		System.out.print("* ");
	}
	System.out.println(" ");
	star--;
	spaces++;
    }
}
}
