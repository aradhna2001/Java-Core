package ProductManangement;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	//Getter methods
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	// setter methods
	public void setProductId(int productId) {
		this.productId=productId;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	 
	public Product(int productId,String productName,double price,int quantity) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		}
	public void displayProductDetails() {
		System.out.println("Product Details: \n");
		System.out.println("Product Id:  "+this.productId);
		System.out.println("ProductName: "+this.productName);
		System.out.println("Price: "+this.price);
		System.out.println("Quantity:  "+this.quantity);
	}
	
	
}
