package inheritance2;

public class EmailLogger extends Logger{
	//@Override (bu java da yaz�lmasa da olur) ben bu kodu ezdim demektir.
	public void log() { //oveerride etmek (�zerine yazmak)(eziyorum)
		System.out.println("Email Logland�");
	}
}
