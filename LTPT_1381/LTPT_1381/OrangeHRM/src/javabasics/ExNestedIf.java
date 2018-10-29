package javabasics;

public class ExNestedIf {
	public static void main(String args[]) {
		int a = 8;
		int b = 10;

		if (a == 8) {
			if (b == 8) {
				System.out.println("Hi");
			} else {
				System.out.println("Hello");
			}
		} else {
			System.out.println("Byee");
		}
	}
}
