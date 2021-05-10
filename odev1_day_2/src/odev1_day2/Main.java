package odev1_day2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + Angular)", "Engin Demiro�");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java + REACT)", "Engin Demiro�");
		Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs", "Engin Demiro�");

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
		instructor1.name ="Engin Demiro�";
	
		System.out.println("E�itmen :" + instructor1.name);
		
		
		System.out.println("\nMetodlar :\n");
		
		CourseManager courseManager = new CourseManager();
		courseManager.start(course2);
		courseManager.register(course3);
		courseManager.search(course1);
	}
	

}
