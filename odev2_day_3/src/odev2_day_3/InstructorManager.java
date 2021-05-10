package odev2_day_3;

public class InstructorManager {

	public void LogIn(User user) {
		System.out.println(user.getId()+" id'sine sahip egitmen giris yapti.\n\n");
	}
	
	public void ShowInstructorDetail(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		System.out.println("\n"+instructor.getInstructorDetail());
	}
}
