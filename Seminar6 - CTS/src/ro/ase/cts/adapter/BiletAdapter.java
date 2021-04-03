package ro.ase.cts.adapter;

public class BiletAdapter extends Bilet  implements BiletOnline{

	public BiletAdapter(double pret) {
		super(pret);
	}

	@Override
	public void vindeBiletOnline() {
		super.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezerva();
	}
	
}
