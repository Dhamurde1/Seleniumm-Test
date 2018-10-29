package javabasics;

public class ExNestedWhile {
	public static void main(String args[])
	{
		int i;
		int j;
		i=1;
		while(i<=5)
		{
			j=1;
			while(j<=5)
			{
				System.out.print(i + "  ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
