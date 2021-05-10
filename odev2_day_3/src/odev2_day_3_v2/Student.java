package odev2_day_3_v2;

public class Student extends User{

	private String school;

	public Student(String firstName, String lastName, String email, String userName, String password,
			String school) {
		super(firstName, lastName, email, userName, password);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	

}
