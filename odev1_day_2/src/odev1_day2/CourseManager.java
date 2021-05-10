package odev1_day2;

public class CourseManager {

	public void start(Course course) {
		System.out.println("Ders Programý Görüntülendi :" + course.name);
}
	
	public void register(Course course) { 
		System.out.println("Ücretsiz Kaydolundu :" + course.name);
}
	public void search(Course course) { 
		System.out.println("Arama Sonucu Gösterildi :" + course.name);
	}
	
}
