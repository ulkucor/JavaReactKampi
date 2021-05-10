package inheritance2; //ekranda müþteri iþlerini yapacak olan sýnýfým

public class CustomerManager {

	public void add(Logger logger) {
		
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		
		// Burada bu koda gerek yok - DatabaseLogger logger = new DatabaseLogger();
		
		logger.log();
	}
}

// Bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanacaksa ASLA
// somut sýnýftan(iþ yapan sýnýflar: file, email gibi) gidilmez.