package odev2_day_3_v2;

public class StudentManager {

	public void ShowStudentDetail(Student student) {
		System.out.println("Ogrencinin Adi: "+student.getFirstName()+" Ogrencinin Soyadi: "+student.getLastName()+" Ogrencinin Okulu: "+student.getSchool());
	}
}
