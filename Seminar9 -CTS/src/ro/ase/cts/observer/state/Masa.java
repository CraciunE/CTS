package ro.ase.cts.observer.state;

public class Masa {
	private int cod;
	private State stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare= new StareLibera();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	};
	
	public void rezervaMasa() {
		if(this.stare instanceof StareLibera) {
			System.out.println("Masa cu codul "+ this.cod+ " poate fi rezervata");
			this.stare= new StareRezervare();
		}else {
			System.out.println("Masa nu poate fi rezervata");
		}
		
	}
	
	public void ocupaMasaFaraRezervare() {
		if(this.stare instanceof StareLibera) {
			System.out.println("Masa cu codul "+ this.cod + " a fost ocupata" );
			this.stare= new StareOcupata();
		}else {
			System.out.println("Masa nu poate fi rezervata");
		}
	}
	
	public void ocupaMasa() {
		if(this.stare instanceof StareRezervare) {
			System.out.println("Masa cu codul "+ this.cod+ " este ocupata");
			this.stare= new StareOcupata();
		}else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}
	
	
	
	public void elibereazaMasa() {
		if(this.stare instanceof StareOcupata || this.stare instanceof StareRezervare) {
			System.out.println("Masa cu codul "+ this.cod +" este eliberata");
			this.stare= new StareLibera();
		}else {
			System.out.println("Masa este deja libera");
		}
	}
	
}
