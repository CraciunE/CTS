package ro.ase.cts.factoruMethod;

public class FactoryMijlocas implements Factory {

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		return new Mijlocas(numeJucator);
	}

}
