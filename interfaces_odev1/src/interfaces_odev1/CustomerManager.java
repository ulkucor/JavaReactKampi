package interfaces_odev1;

public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	
	
	public void add() {
		//buras� Dal � �a��racak. Burada i� kodlar� yaz�l�r.
		
		customerDal.add();	
	
	}
}
