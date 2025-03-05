package VivekFurniture;

public class CustomerDetails {
	private String customerName;
	private long phoneNumber;
	private String address;
	
	//Creating Constructor
	public CustomerDetails(String customerName,long phoneName,String address) {
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.address=address;
	}
	
	// Default Constructor
	public CustomerDetails() {
		}
	
	// Getter & Setter for CustomerName
	public String getCustomerName() {
		return customerName;
	}	
	public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

	// Getter & Setter for phoneNumber
	public long getPhoneNumber() {
		return phoneNumber;
	}	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	//Getter & Setter for address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	
	
}