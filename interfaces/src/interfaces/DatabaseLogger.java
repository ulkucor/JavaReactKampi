package interfaces;

public class DatabaseLogger implements Logger {

	@Override  //implement edilen anlamýndadýr, methodu eziyoruz.
	public void log(String message) {

		System.out.println("Database loglandý :" + message);
	}

}
