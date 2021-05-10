package inheritance2;

public class Main {

	public static void main(String[] args) {
		//loglama : kim ne zaman ne yaptý
		//birbirinin alternatifi olan kodlar için if yazýlmaz.
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger());
	}

}
