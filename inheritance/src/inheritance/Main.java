package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		//burada customer yerine indcus ya da corcus vermemize raðmen 
		//kodun çalýþmasý bir polimorfizm örneðidir.
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer(); //polimorfizm
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		
		
		
		
//		customerManager.add(hepsiBurada);
//		customerManager.add(engin);
//		customerManager.add(abc);
	}

}
