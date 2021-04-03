package ro.ase.cts.adapter;

public class AdapterBiletObiecte implements BiletOnline{
	private Bilet bilet;
	
	public AdapterBiletObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		this.bilet.vinde();
		
	}

	@Override
	public void rezervaBiletOnline() {
		this.bilet.rezerva();
		
	}
	
}
