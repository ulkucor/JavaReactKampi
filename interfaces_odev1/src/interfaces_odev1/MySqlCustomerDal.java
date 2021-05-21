package interfaces_odev1;

//Dal = Data access layer : veritabaný ile ilgili operasyonlarý buraya yazarýz. 

public class MySqlCustomerDal implements ICustomerDal, IRepository {
//bir classý extend etse o da buraya yazýlabilir.
	@Override
	public void add() {
		System.out.println("MySql eklendi");
		
	} 

	
}
