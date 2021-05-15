package interfaces;

public class CustomerManager {

	private Logger[] loggers;
	
	//CustomerManager loglamaya ba��ml�d�r. 2 t�r ba��ml�l�k vard�r:
	//loosly - tightly coupled
	
	public CustomerManager(Logger[] loggers) {
		//super();
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " Veri taban�na logland�");
	
		//Utils utils = new Utils(); bunu b�yle kullanmak yerine alttaki kodda
		//utils yerine Utils olarak kullanmak i�in Utils metodunu static yapar�z.
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + " Veri taban�na logland�");
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName());
	}

	
	

}

