package CollageFee;

public class DayScholar extends Student{
	private int busNumber;
	private float distance;
	
	// Constructor Creating
	DayScholar(int studentId, String studentName,String department,String gender,String category,double collageFee,int BusNumber,float distance){
		super(studentId,studentName,department,gender,category,collageFee);
		this.busNumber=busNumber;
		this.distance=distance;
		
	}
	
	

	//Getter and setter Methods
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber=busNumber;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance=distance;
	}
	
	public double calculateTotalFee() {
		double busFee=0.0;
		if(distance>30 && distance<=40) {
			busFee=28000;
		}
		else if(distance>20 && distance<=30) {
			busFee=20000;
		}
		else if(distance>10 && distance<=20) {
			busFee=12000;
		}
		else if(distance<=10) {
			busFee=6000;
		}
		return  this.getCollageFee()+busFee;
		
	}
	
}
