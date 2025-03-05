package CollageFee;

public abstract class Student {
	// Attributes in Student
	protected int studentId;
	protected String studentName;
	protected String department;
	protected String category;
	protected String gender;
	protected double collageFee;
	
	//  Getter Methods 
	public int getStudentId() {
		return this.studentId;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public String getDepartment() {
		return this.department;
	}
	public String getCategory() {
		return this.category;
	}
	public String getGender() {
		return this.gender;
	}
	public double getCollageFee() {
		return this.collageFee;
	}
	// Setter method
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}	
	public void setDepartment(String department) {
		this.department=department;
	}	
	public void setCategory( String category) {
		this.category=category;
	}	
	public void setGender( String gender) {
		this.gender=gender;
	}	
	public void setCollageFee(double collageFee) {
		this.collageFee=collageFee;
	}
	public Student(int studentId,String studentName,String department,String category,String gender,double collageFee) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.department=department;
		this.category=category;
		this.gender=gender;
		this.collageFee=collageFee;
		
	}
	public abstract double calculateTotalFee();
}
