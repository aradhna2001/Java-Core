package ProductManangement;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter ProductId:");
		scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter ProductName:");
		String productName=scanner.nextLine();
		
		System.out.print("Enter ProductPrice:");
		double price=scanner.nextDouble();
		
		System.out.print("Enter ProductQuantity:");
		int quantity=scanner.nextInt();
		
		Product p=new Product(quantity, productName, price, quantity);
		
		p.displayProductDetails();
		scanner.close();
		
		}

}
