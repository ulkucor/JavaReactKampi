package inheritance2;

public class EmailLogger extends Logger{
	//@Override (bu java da yazýlmasa da olur) ben bu kodu ezdim demektir.
	public void log() { //oveerride etmek (üzerine yazmak)(eziyorum)
		System.out.println("Email Loglandý");
	}
}
