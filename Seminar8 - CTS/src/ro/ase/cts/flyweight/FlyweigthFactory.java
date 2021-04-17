package ro.ase.cts.flyweight;

import java.util.HashMap;

public class FlyweigthFactory {
	private HashMap<String, Client> map;

	public FlyweigthFactory() {
		super();
		this.map = map;
	}
	
	public Client getClient(String nrTelefon) {
		Client client;
		client= map.get(nrTelefon);
		if( client ==null) {
			client = new Client("Ion",nrTelefon, "ion@gmail.com");
			map.put(nrTelefon, client);
		}
		return client;
	}
}
