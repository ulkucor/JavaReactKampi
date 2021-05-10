package odev2_day_3;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("Ulku", "Cor", "ulkucor@gmail.com", "ulkucor", "12345");
		
		Instructor instructor = new Instructor("Engin", "Demirog", "engindemirog@gmail.com", "engindemirog", "12345", "Yazýlým geliþtirmeye lisede 'yazýlým' bölümünde okurken baþladým." 
		
		+ "Üniversite hayatýma ÖSS 2003 Türkiye derecesiyle baþladým. Sýrasýyla Baþkent ve ODTÜ'de Yönetim Biliþim Sistemleri (Lisans-Burslu) ve Týp Biliþimi(Yüksek Lisans) okudum." 
		+ "Profesyonel iþ hayatýma ise henüz üniversite birinci sýnýftayken baþladým. Aðýrlýklý olarak Savunma Sanayisi, Bankacýlýk sektörlerine kurumsal yazýlým geliþtirme süreçleri konusunda danýþmanlýk veriyorum."
		+ "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahibim. \"Engin Demiroð\" YouTube kanalýmda ücretsiz eðitim videolarý ve içerikleri paylaþmaktayým."
		+ "Danýþmanlýk yaptýðým kurumlarýn bazýlarý : Merkez Bankasý,TAI, Birleþmiþ Milletler,NATO,Ýþ Bankasý, Akbank, Halkbank, Vakýfbank, Yapý Kredi Bankasý, Ziraat Bankasý, Emniyet, Baþbakanlýk, Cumhurbaþkanlýðý, "
		+ "Hazine Müsteþarlýðý, Maliye Bakanlýðý, Tarým Bakanlýðý, Tübitak.\r\n"
		+ "Danýþmanlýk veya eðitim verdiðim kurum sayýsý son 10 yýlda 300'ü geçmiþtir.DevFramework ismiyle geliþtirdiðim altyapý projem birçok kurum ve firmada yazýlým geliþtirme altyapýsý olarak kullanýlmaktadýr.\")\r\n");
		
		Student student = new Student("Dursun", "Eryilmaz", "dursuneryilmaz@gmail.com", "dursuneryilmaz", "12345", "Ege Universitesi");
		
		UserManager userManager = new UserManager();
		
		userManager.AddUser(user);
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.LogIn(instructor);
		instructorManager.ShowInstructorDetail(instructor);
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.ShowStudentDetail(student);






	}

}
