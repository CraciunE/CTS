package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		Rezervare r1= new Rezervare(1234,false, false, true, true, "Rock");
		System.out.println(r1.toString());
		
		Rezervare r2= new BuilderRezervare().setCod(15).setAreBauturaInclusa(true).build();
		System.out.println(r2.toString());
		
		Rezervare r3= new BuilderRezervare(22).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).build();
		System.out.println(r3.toString());

		BuilderRezervare br= new BuilderRezervare();
		Rezervare r4= br.setCod(21).setAreBauturaInclusa(true).build();
		Rezervare r5= br.setCod(2123).setAreBauturaInclusa(true).build();
		System.out.println(r4.toString());
		System.out.println(r5.toString());
		
		
	}

}
