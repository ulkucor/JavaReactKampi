package odev2_day_3;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("Ulku", "Cor", "ulkucor@gmail.com", "ulkucor", "12345");
		
		Instructor instructor = new Instructor("Engin", "Demirog", "engindemirog@gmail.com", "engindemirog", "12345", "Yaz�l�m geli�tirmeye lisede 'yaz�l�m' b�l�m�nde okurken ba�lad�m." 
		
		+ "�niversite hayat�ma �SS 2003 T�rkiye derecesiyle ba�lad�m. S�ras�yla Ba�kent ve ODT�'de Y�netim Bili�im Sistemleri (Lisans-Burslu) ve T�p Bili�imi(Y�ksek Lisans) okudum." 
		+ "Profesyonel i� hayat�ma ise hen�z �niversite birinci s�n�ftayken ba�lad�m. A��rl�kl� olarak Savunma Sanayisi, Bankac�l�k sekt�rlerine kurumsal yaz�l�m geli�tirme s�re�leri konusunda dan��manl�k veriyorum."
		+ "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalar�na sahibim. \"Engin Demiro�\" YouTube kanal�mda �cretsiz e�itim videolar� ve i�erikleri payla�maktay�m."
		+ "Dan��manl�k yapt���m kurumlar�n baz�lar� : Merkez Bankas�,TAI, Birle�mi� Milletler,NATO,�� Bankas�, Akbank, Halkbank, Vak�fbank, Yap� Kredi Bankas�, Ziraat Bankas�, Emniyet, Ba�bakanl�k, Cumhurba�kanl���, "
		+ "Hazine M�ste�arl���, Maliye Bakanl���, Tar�m Bakanl���, T�bitak.\r\n"
		+ "Dan��manl�k veya e�itim verdi�im kurum say�s� son 10 y�lda 300'� ge�mi�tir.DevFramework ismiyle geli�tirdi�im altyap� projem bir�ok kurum ve firmada yaz�l�m geli�tirme altyap�s� olarak kullan�lmaktad�r.\")\r\n");
		
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
