package ro.ase.cts.flyweight;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1= new Rezervare(1, 4, "18:00");
		Rezervare rezervare2= new Rezervare(5, 10, "20:00");
		Rezervare rezervare3= new Rezervare(2, 2, "12:00");
		
		FlyweigthFactory flyweightFactory = new FlyweigthFactory();
		Client client1 = flyweightFactory.getClient("0728824988");
		
		client1.printeazaRezervare(rezervare1);
		flyweightFactory.getClient("0728824488").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("0728824988").printeazaRezervare(rezervare3);
		

	}

}
