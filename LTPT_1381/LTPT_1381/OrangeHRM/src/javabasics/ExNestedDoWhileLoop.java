package javabasics;

public class ExNestedDoWhileLoop {
	public static void main(String args[]) {
		int i;
		int j;
		i = 1;
		do {
			j = 1;
			do {
				System.out.print(j +" ");
				j++;
			} while (j <= 5);
			System.out.println();
			i++;
		} while (i <= 5);
	}
}
