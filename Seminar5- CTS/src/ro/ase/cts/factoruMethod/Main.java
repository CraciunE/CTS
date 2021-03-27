package ro.ase.cts.factoruMethod;

public class Main {
	
	private static void afiseazaInformatiiJucator(Factory factory, String numeJucator) {
		Jucator jucator= factory.creeazaJucator(numeJucator);
		System.out.println(jucator.toString());
	}

	public static void main(String[] args) {
		afiseazaInformatiiJucator(new FactoryPortar(),"Mihai");
		afiseazaInformatiiJucator(new FactoryFundas(), "Andrei");
		afiseazaInformatiiJucator(new FactoryMijlocas(),"Mircea");
	}

}
