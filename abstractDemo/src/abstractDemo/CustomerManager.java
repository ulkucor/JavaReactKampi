package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager databaseManager; //strateji
	
	public void getCustomers() {
		//OracleDatabaseManager oracleDatabaseManager = new 
		//gibi bi kullanım yaparsak oracle a bağımlı oluruz.
		//bunu önlemek için strateji patern lerini kullanırız.
		
		databaseManager.getData();
	}
}
