package interfaces;

public class CustomerManager {

	private Logger[] loggers;
	
	//CustomerManager loglamaya baðýmlýdýr. 2 tür baðýmlýlýk vardýr:
	//loosly - tightly coupled
	
	public CustomerManager(Logger[] loggers) {
		//super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " Veri tabanýna loglandý");
	
		//Utils utils = new Utils(); bunu böyle kullanmak yerine alttaki kodda
		//utils yerine Utils olarak kullanmak için Utils metodunu static yaparýz.
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " Veri tabanýna loglandý");
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName());
	}

	
	

}

