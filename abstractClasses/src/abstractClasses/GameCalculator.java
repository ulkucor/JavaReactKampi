package abstractClasses;

public abstract class GameCalculator { 
//bu classýn abstract olmasý her inherit eden classýn bu methodu overriide etmesi gerektiði anlamýndadýr.
	// ve her classta bulunmalýdýr.
	public abstract void hesapla(); 
	
	public final void gameOver() { //final override edilmesini istemiyorum demek.
		System.out.println("Oyun Bitti.");
	}
}
