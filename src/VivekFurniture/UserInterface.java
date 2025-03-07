package VivekFurniture;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Getting Customer Details
		System.out.println("Enter Customer Name: ");
		String name=sc.nextLine();
		sc.nextLine();// consume NewLine
		
		System.out.println("Enter Phone Number: ");
		long phone=sc.nextLong();
		
		System.out.println("Enter Address: ");
		String address=sc.next();
		
		CustomerDetails customer=new CustomerDetails(name,phone,address);
		
		// Bero 
		System.out.println("Enter BeroType: ");
		String beroType=sc.nextLine();
		
		
		
		
		
		
		
		
		

	}

}
