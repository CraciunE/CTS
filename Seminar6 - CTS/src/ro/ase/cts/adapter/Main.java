package ro.ase.cts.adapter;

public class Main {

	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletePePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet= new Bilet(145);
		rezervaSiVindeBiletLaCasa(bilet);
		
		BiletAdapter adapterBilet= new BiletAdapter(225);
		rezervaSiVindeBiletePePlatforma(adapterBilet);
		
		BiletOnline biletOnline = new AdapterBiletObiecte(bilet);
		rezervaSiVindeBiletePePlatforma(biletOnline);
	}

}
