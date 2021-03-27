package ro.ase.cts.factoruMethod;

public class FactoryPortar implements Factory {

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		return new Portar(numeJucator);
	}

}
