package interfaces;

public class DatabaseLogger implements Logger {

	@Override  //implement edilen anlam�ndad�r, methodu eziyoruz.
	public void log(String message) {

		System.out.println("Database logland� :" + message);
	}

}
