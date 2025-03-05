package OOPS;

public class Address {
	
	private int duration;
	private String city;
	
	Address(){
		this.duration=4;
		this.city="Delhi";
	}
	
	Address(int duration,String city){
		this.duration=duration;
		this.city=city;
	}
	
	@Override
	public String toString() {
		return "Month="+this.duration +"   City="+this.city;
	}
}