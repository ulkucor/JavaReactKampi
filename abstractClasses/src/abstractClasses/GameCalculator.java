package abstractClasses;

public abstract class GameCalculator { 
//bu class�n abstract olmas� her inherit eden class�n bu methodu overriide etmesi gerekti�i anlam�ndad�r.
	// ve her classta bulunmal�d�r.
	public abstract void hesapla(); 
	
	public final void gameOver() { //final override edilmesini istemiyorum demek.
		System.out.println("Oyun Bitti.");
	}
}
