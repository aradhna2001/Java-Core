package CollageFee;
import java.util.Scanner;

public class UserInterface {



	public static void main(String[] args) {
		//Student s=new Student(101, "Sumit", "General", "MCA", "Male", 60000);
		//s.setStudentId(101);
		//s.setStudentName("Sumit");
		//s.setCategory("BCA");
		//s.setDepartment("MCA");
		//s.setGender("Male");
		//s.setCollageFee(166000);
		
		 
		
		/*System.out.printf("\n%-15s : %s","Student Id",s.getStudentId());
		System.out.printf("\n%-15s : %s","StudentName",s.getStudentName());
		System.out.printf("\n%-15s : %s","category",s.getCategory());
		System.out.printf("\n%-15s : %s","department",s.getDepartment());
		System.out.printf("\n%-15s : %s","gender",s.getGender());
		System.out.printf("\n%-15s : %s","Collage Fess",s.getCollageFee());
		*/
		
		
		
		// TODO Auto-generated method Student
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		int StudentId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the StudentName: ");
		String StudentName=sc.nextLine();
		
		System.out.println("Enter DepartmentName: ");
		String department=sc.nextLine();
		
		System.out.println("Enter gender: ");
		String gender=sc.nextLine();
		
		System.out.println("Enter Category: ");
		String category=sc.nextLine();
		
		System.out.println("Enter CollageFee: ");
		int collageFee=sc.nextInt();
		
		if(category.equals("Hosteller")) {
			System.out.println("Enter RoomNumber: ");
			int roomNumber=sc.nextInt();
			sc.nextLine();
			
		System.out.println("Enter the blockName: ");
		char blockName=sc.next().charAt(0);
			
		System.out.println("Enter the roomType");
		String roomType=sc.nextLine();
	
		hosteller h1=new hosteller(StudentId,StudentName,department,gender,category,collageFee,roomNumber,blockName,roomType);
		System.out.println("Total collageFees is: "+h1.calculateTotalFee());
	    }
		
		else if(category.equals("DayScholar")) {
			System.out.println("Enter BusNumber: ");
			int busNumber=sc.nextInt();
			
		System.out.println("Enter distance: ");
		int distance=sc.nextInt();
		
		DayScholar d1=new DayScholar(StudentId,StudentName,department,gender,category,collageFee,busNumber,distance);
		System.out.println("Total collage Fees is: "+d1.calculateTotalFee());
		
	
			
		}
		
		
		
		

	}

}
