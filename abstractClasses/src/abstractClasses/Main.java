package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new GameCalculator() {
			// alttaki kodlar ide tarafýndan otomatik geldi.
			// bu operasyonlar olmadan abstract classlar new lenemez!!
			
			//@Override
			//public void hesapla() {
				// TODO Auto-generated method stub
				
			//}
		//};  Zaten bu kullaným önerilmiyor.
		
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
	}

}
