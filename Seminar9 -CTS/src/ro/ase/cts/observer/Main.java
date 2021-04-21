package ro.ase.cts.observer;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant= new Restaurant("Caju", "Bucuresti");
		
		Client client1 = new Client("Andrei");
		Client client2 = new Client("Ana");
		Client client3 = new Client("Aneta");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.realizareOfertaPret();
		
		restaurant.stergeObserver(client1);
		restaurant.adaugaObserver(client3);
		
		restaurant.introducereMeniu();
		
		

	}

}
