package odev1_day2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)", "Engin Demiroð");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java + REACT)", "Engin Demiroð");
		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Engin Demiroð");

		Course[] courses = {course1, course2, course3}; 
		
		System.out.println("Kurslar :\n");
		
		for (Course course : courses) {
			System.out.println(course.name);
			System.out.println(course.detail + "\n");

		}
		
		System.out.println("\n" + courses.length + " kurs listelendi.\n");
		
		
		Category category1 = new Category();
		category1.id =1;
		category1.name ="Programlama";
		
		System.out.println("Kategori :" + category1.name);
		
		Instructor instructor1 = new Instructor();
		instructor1.id =2;
		instructor1.name ="Engin Demiroð";
	
		System.out.println("Eðitmen :" + instructor1.name);
		
		
		System.out.println("\nMetodlar :\n");
		
		CourseManager courseManager = new CourseManager();
		courseManager.start(course2);
		courseManager.register(course3);
		courseManager.search(course1);
	}
	

}
