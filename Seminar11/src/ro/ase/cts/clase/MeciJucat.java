package ro.ase.cts.clase;

public class MeciJucat {
	private String echipaGazda;
	private String echipaOaspeti;
	private int nrSpectatori;
	private int nrBilete;
	private int nrJandarmi;
	private int nrStewarzi;
	
	public MeciJucat(String echipaGazda, String echipaOaspeti, int nrSpectatori, int nrBilete, int nrJandarmi,
			int nrStewarzi) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrBilete = nrBilete;
		this.nrJandarmi = nrJandarmi;
		this.nrStewarzi = nrStewarzi;
	}
	
	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}
	
	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}
	
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	
	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}
	
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	
	public void setNrStewarzi(int nrStewarzi) {
		this.nrStewarzi = nrStewarzi;
	}
	
	public Memento creareMemento() {
		Memento memento = new Memento(this.echipaGazda, this.echipaOaspeti, this.nrSpectatori);
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.echipaGazda = memento.getNumeEchipaGazda();
		this.echipaOaspeti =  memento.getNumeEchiaOaspeti();
		this.nrSpectatori =  memento.getNrSpectatori();
	}

	@Override
	public String toString() {
		return "MeciJucat [echipaGazda=" + echipaGazda + ", echipaOaspeti=" + echipaOaspeti + ", nrSpectatori="
				+ nrSpectatori + ", nrBilete=" + nrBilete + ", nrJandarmi=" + nrJandarmi + ", nrStewarzi=" + nrStewarzi
				+ "]";
	}
	
	
	
	
}
