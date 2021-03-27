package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Marcel", 23);
		Client client2 = (Client) client1.copiaza();
		Copiator client3 = client2.copiaza();
		
		System.out.println(client1);
		System.out.println(client2);
		System.out.println(client3);
		
		Bilet bilet1 = new Bilet(22, "echipa1", "echipa2", "20:00");
		Bilet bilet2 = (Bilet) bilet1.copiaza();
		Bilet bilet3= (Bilet) bilet1.copiaza();
		bilet2.setCod(25);
		bilet3.setCod(24);
		
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
		System.out.println(bilet3.toString());
	}
	

}
