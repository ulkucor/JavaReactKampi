package interfaces_odev1;

public class Main {

	public static void main(String[] args) {
		// interfaceler de abstractlar gibi newlenemezler: ICustomerDal customerDal = new ICustomerDal()
	
		//ICustomerDal customerDal = new OracleCustomerDal();
	//interface onu implemente eden classýn referansýný tutabilir: polimorfizm.
	
	CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
	//customerManager.customerDal = new MySqlCustomerDal();
	customerManager.add(); //sadece bu satýrý üstekini eklenemeden bu þekilde yazarsam hata verecektir.
	//null point exception.
	
	}

}
