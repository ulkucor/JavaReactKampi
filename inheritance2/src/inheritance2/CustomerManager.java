package inheritance2; //ekranda m��teri i�lerini yapacak olan s�n�f�m

public class CustomerManager {

	public void add(Logger logger) {
		
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		
		// Burada bu koda gerek yok - DatabaseLogger logger = new DatabaseLogger();
		
		logger.log();
	}
}

// Bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullanacaksa ASLA
// somut s�n�ftan(i� yapan s�n�flar: file, email gibi) gidilmez.