package oops;

public class ExExceptionHandling {
	public static void main(String args[]) {
	
    System.out.println("Open Browser");
	int a;
	a=30;
	int b;
	b=0;
	int c;
	try{
		c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}	
	System.out.println("Close Browser");	
	}
}
