package interfaces_odev1;

public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	
	
	public void add() {
		//burasý Dal ý çaðýracak. Burada iþ kodlarý yazýlýr.
		
		customerDal.add();	
	
	}
}
