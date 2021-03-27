package ro.ase.cts.prototype;

public class Bilet implements Copiator {
	private int cod;
	private String echipaA;
	private String echipaB;
	private String ora;
	
	public Bilet(int cod, String echipaA, String echipaB, String ora) {
		super();
		this.cod = cod;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.ora = ora;
	}
	
	private Bilet() {}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public Copiator copiaza() {
		Bilet bilet = new Bilet();
		bilet.cod = this.cod;
		bilet.echipaA =  this.echipaA;
		bilet.echipaB = this.echipaB;
		bilet.ora = this.ora;
		return bilet;
	}

	@Override
	public String toString() {
		return "Bilet [cod=" + cod + ", echipaA=" + echipaA + ", echipaB=" + echipaB + ", ora=" + ora + "]";
	}
	
	
	
	
	
	
	
	

}
