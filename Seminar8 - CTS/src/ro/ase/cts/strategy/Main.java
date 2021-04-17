package ro.ase.cts.strategy;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Marian", new PlataCard());
		client.platesteNota(550);
		client.setModPlata(new PlataCash());
		client.platesteNota(55);
	}

}
