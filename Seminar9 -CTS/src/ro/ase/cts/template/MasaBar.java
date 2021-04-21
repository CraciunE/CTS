package ro.ase.cts.template;

public class MasaBar extends Masa {

	public MasaBar(int cod) {
		super(cod);
	}

	
	@Override
	public void aseazaTacamuri() {
		System.out.println("Pe masa "+ this.cod +" au fost asezate paharele");
	}

}
