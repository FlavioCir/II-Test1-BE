package Esercizio2;

public class Main2 {

	public static void main(String[] args) {
		
		ContatoreAuto c1 = new ContatoreAuto();
		try {
			c1.inserisciDati();
		}
		catch (NullException e) {
			
		}
		c1.closeScanner();

	}

}
