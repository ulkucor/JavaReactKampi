package odev2_day_3;

public class Instructor extends User{

	private String instructorDetail;

	public Instructor(String firstName, String lastName, String email, String userName, String password,
			String instructorDetail) {
		super(firstName, lastName, email, userName, password);
		this.instructorDetail = instructorDetail;
	}

	public String getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(String instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	
	
}
