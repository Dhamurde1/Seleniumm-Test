package oops;

public class ExMainInheritance {

	public static void main(String args[])
	{
		Teacher obj=new Teacher();
		obj.setId(20);
		obj.setName("vishnu");
		obj.setSal(3333333.33);		
		
		System.out.println("id is:" +obj.getId());
		System.out.println("id is:" +obj.getName());
		System.out.println("id is:" +obj.getSal());
		
		
		Student amol=new Student();
		
		amol.setId(40);
		amol.setName("Amol");
		amol.setPercentage(65.23);
		
		System.out.println("id is:" +amol.getId());
		System.out.println("id is:" +amol.getName());
		System.out.println("id is:" +amol.getPercentage());
	}
}
