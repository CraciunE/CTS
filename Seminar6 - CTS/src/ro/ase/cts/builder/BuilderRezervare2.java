package ro.ase.cts.builder;

public class BuilderRezervare2 implements AbstractBuiler {
	private int cod;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String  genMuzica;

	public BuilderRezervare2() {
		this.cod=0;
		this.areMancareInclusa=false;
		this.areBauturaInclusa=false;
		this.areScaunErgonomic=false;
		this.areMuzicaAmbientala=false;
		this.genMuzica=null;
	}
	
	
	
	public BuilderRezervare2 setCod(int cod) {
		this.cod = cod;
		return this;
	}



	public BuilderRezervare2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}



	public BuilderRezervare2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}



	public BuilderRezervare2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}



	public BuilderRezervare2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}



	public BuilderRezervare2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}



	@Override
	public Rezervare build() {
		return new Rezervare(cod,areMancareInclusa, areBauturaInclusa, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
		
	}

}
