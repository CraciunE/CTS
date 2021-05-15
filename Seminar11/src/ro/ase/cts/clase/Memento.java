package ro.ase.cts.clase;

public class Memento {
	private String numeEchipaGazda;
	private String numeEchiaOaspeti;
	private int nrSpectatori;
	
	public Memento(String numeEchipaGazda, String numeEchiaOaspeti, int nrSpectatori) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchiaOaspeti = numeEchiaOaspeti;
		this.nrSpectatori = nrSpectatori;
	}
	
	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}
	
	public String getNumeEchiaOaspeti() {
		return numeEchiaOaspeti;
	}
	
	public int getNrSpectatori() {
		return nrSpectatori;
	}

	
	
	
	
}
