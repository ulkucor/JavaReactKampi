package interfaces_odev1;

//Dal = Data access layer : veritaban� ile ilgili operasyonlar� buraya yazar�z. 

public class MySqlCustomerDal implements ICustomerDal, IRepository {
//bir class� extend etse o da buraya yaz�labilir.
	@Override
	public void add() {
		System.out.println("MySql eklendi");
		
	} 

	
}
