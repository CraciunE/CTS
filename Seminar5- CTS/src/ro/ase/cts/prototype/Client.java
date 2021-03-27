package ro.ase.cts.prototype;

public class Client implements Copiator {
	
	private String nume;
	private int varsta;
	
	private Client() {
		super();
	}

	public Client(String nume, int varsta) {
		super();
		//se fac validari pt nume si varsta
		this.nume = nume;
		this.varsta = varsta;
	}

	@Override
	public Copiator copiaza() {
		Client client = new Client();
		client.nume = this.nume;
		client.varsta = this.varsta;
		return client;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", varsta=" + varsta + "]";
	}
	
	
	
	
}
