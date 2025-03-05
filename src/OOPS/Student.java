package OOPS;

public class Student {
	
	private int sId;
	private String sName;
	private Address address;
	
	Student(){
		
	}
	Student(int sId,String sName){
		this.sId=sId;
		this.sName=sName;
	}
	Student(int sId,String sName,Address add){
		this.sId=sId;
		this.sName=sName;
		this.address=add;
	}
	
	@Override
	public String toString() {
		return this.sId +"    "+this.sName +"   "+address;
	}
	
	public void setsId(int sId) {
		this.sId=sId;
	}
	public void setsName(String sName) {
		this.sName=sName;
	}
	
	public int getsId() {
		return this.sId;
	}
	
	public String getsName() {
		return this.sName;
	}
	
	
}