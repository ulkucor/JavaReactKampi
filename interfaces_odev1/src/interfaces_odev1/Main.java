package interfaces_odev1;

public class Main {

	public static void main(String[] args) {
		// interfaceler de abstractlar gibi newlenemezler: ICustomerDal customerDal = new ICustomerDal()
	
		//ICustomerDal customerDal = new OracleCustomerDal();
	//interface onu implemente eden class�n referans�n� tutabilir: polimorfizm.
	
	CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
	//customerManager.customerDal = new MySqlCustomerDal();
	customerManager.add(); //sadece bu sat�r� �stekini eklenemeden bu �ekilde yazarsam hata verecektir.
	//null point exception.
	
	}

}
