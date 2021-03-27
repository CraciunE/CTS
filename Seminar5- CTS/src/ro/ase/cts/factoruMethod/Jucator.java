package ro.ase.cts.factoruMethod;

public abstract class Jucator {
	private String numeJucator;

	public Jucator(String numeJucator) {
		super();
		this.numeJucator = numeJucator;
	}

	@Override
	public String toString() {
		return "Jucator [numeJucator=" + numeJucator + "]";
	}
	
	

}
