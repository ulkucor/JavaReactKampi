package interfaces;

public class DatabaseLogger implements Logger {

	@Override  //implement edilen anlamındadır, methodu eziyoruz.
	public void log(String message) {

		System.out.println("Database loglandı :" + message);
	}

}
