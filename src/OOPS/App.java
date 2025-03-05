package OOPS;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ID     NAME ");
		
		Student s1=new Student();
		s1.setsId(101);
		s1.setsName("Sparsh");
		System.out.println(s1.getsId()+"    "+s1.getsName());
		
		Student s2=new Student(102,"Swati");
		System.out.println(s2.getsId()+"    "+s2.getsName());
		
		Student s3=new Student();
		s3.setsId(103);
		s3.setsName("Virender");
		System.out.println(s3.getsId()+"    "+s3.getsName());
		
		Student s4=new Student(104,"Tushar");
		System.out.println(s4);
		
		Student s5=new Student(105,"Aradhana", new Address());
		System.out.println(s5);
		
		Student s6=new Student(106,"Sonal", new Address(5,"NCR"));
		System.out.println(s6);
		
	}

}