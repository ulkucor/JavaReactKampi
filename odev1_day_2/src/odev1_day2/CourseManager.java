package odev1_day2;

public class CourseManager {

	public void start(Course course) {
		System.out.println("Ders Program� G�r�nt�lendi :" + course.name);
}
	
	public void register(Course course) { 
		System.out.println("�cretsiz Kaydolundu :" + course.name);
}
	public void search(Course course) { 
		System.out.println("Arama Sonucu G�sterildi :" + course.name);
	}
	
}
