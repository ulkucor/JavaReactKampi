package interfaces_odev1;

//Dal = Data access layer : veritabanı ile ilgili operasyonları buraya yazarız. 

public class MySqlCustomerDal implements ICustomerDal, IRepository {
//bir classı extend etse o da buraya yazılabilir.
	@Override
	public void add() {
		System.out.println("MySql eklendi");
		
	} 

	
}
