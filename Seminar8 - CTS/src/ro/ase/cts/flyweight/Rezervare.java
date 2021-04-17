package ro.ase.cts.flyweight;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private String oraRezervarii;
	
	public Rezervare(int nrMasa, int nrPersoane, String oraRezervarii) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervarii = oraRezervarii;
	}

	@Override
	public String toString() {
		return "Rezervare [nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", oraRezervarii=" + oraRezervarii + "]";
	}
	
	
	
}
