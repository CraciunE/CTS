package ro.ase.cts.template;

public class Masa extends TemplateOcupareMasa {

	public Masa(int cod) {
		super(cod);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		System.out.println("Masa " + this.cod + " este curata");
		
	}

	@Override
	public void aseazaServetele() {
		System.out.println("Pe masa "+ this.cod + " au fost asezate servetelele ");
		
	}

	@Override
	public void aseazaTacamuri() {
		System.out.println("Pe masa "+ this.cod +" au fost asezate tacamurile");
	
		
	}

	@Override
	public void invitaPersoane() {
		System.out.println("La masa "+ this.cod+ " au fost invitate persoanele");
		
	}

}
