package CollageFee;

public class hosteller extends Student{
	private int roomNumber;
	private char blockName;
	private String roomType;
	
	//constructor calling 
	public hosteller(int studentId, String studentName, String department, String category, String gender,
			double collageFee, int roomNumber, char blockNamme, String roomType) {
		super(studentId, studentName, department, category, gender, collageFee);
		this.roomNumber = roomNumber;
		this.blockName = blockNamme;
		this.roomType = roomType;
	}
	
	//Getter methods
	public int getRoomNumber() {
		return roomNumber;
	}
	public char getBlockNumber() {
		return blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	// setter methods
	public void setRoomNumber(int roomNumber) {
		this.roomNumber=roomNumber;
	}
	public void setBlockNumber(char blockName) {
		this.blockName=blockName;
	}
	public void setRoomType(String roomType) {
		this.roomType=roomType;
	}
	
	public double calculateTotalFee() {
		double hostellerFee=0.0;
		
		if(this.blockName=='A') {
			hostellerFee=60000;
			if(this.roomType.equals("AC")) {
				hostellerFee+=8000;
			}
		}
		else if(this.blockName=='B') {
			hostellerFee=50000;
			if(this.roomType.equals("AC")) {
				hostellerFee+=5000;
			}
		}
		else if(this.blockName=='C'){
			hostellerFee=40000;
			if(this.roomType.equals("AC")) {
				hostellerFee+=2500;
			}
		}
		
		return this.getCollageFee()+hostellerFee;
		
	}
	
}
