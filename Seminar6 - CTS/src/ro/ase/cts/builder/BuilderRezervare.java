package ro.ase.cts.builder;

public class BuilderRezervare implements AbstractBuiler {
	private Rezervare rezervare;
	
	public BuilderRezervare(int cod) {
		rezervare = new Rezervare(cod, false,false,false,false,"");
		
	}
	
	public BuilderRezervare() {
		super();
		this.rezervare = new Rezervare(0,false, false, false, false,"");
	}
	
	public BuilderRezervare setCod(int cod) {
		rezervare.setCod(cod);
		return this;
	}
	
	public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	
	public BuilderRezervare setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	
	public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	
	public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	
	public BuilderRezervare setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	public void setRezervare(Rezervare rezervare) {
		this.rezervare = rezervare;
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}

}
