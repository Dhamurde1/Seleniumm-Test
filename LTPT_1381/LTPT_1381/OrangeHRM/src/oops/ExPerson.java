package oops;

public class ExPerson {
	int id;
	String name;
	double sal;
	
	ExPerson(int id,String name,double sal)
	{
		this.id = id;
		this.name =name;
		this.sal =sal;
	}

	public static void main(String args[]) {

		ExPerson vishnu = new ExPerson(20,"Vishnu",222222.22);
		
		System.out.println("Id is:" + vishnu.id);
		System.out.println("name is:" + vishnu.name);
		System.out.println("sal is:" + vishnu.sal);
		ExPerson sajjad = new ExPerson(30,"Sajjad",333333.33);		
		System.out.println("Id is:" + sajjad.id);
		System.out.println("name is:" + sajjad.name);
		System.out.println("sal is:" + sajjad.sal);

	}
}
