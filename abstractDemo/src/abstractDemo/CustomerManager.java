package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager databaseManager; //strateji
	
	public void getCustomers() {
		//OracleDatabaseManager oracleDatabaseManager = new 
		//gibi bi kullan�m yaparsak oracle a ba��ml� oluruz.
		//bunu �nlemek i�in strateji patern lerini kullan�r�z.
		
		databaseManager.getData();
	}
}
