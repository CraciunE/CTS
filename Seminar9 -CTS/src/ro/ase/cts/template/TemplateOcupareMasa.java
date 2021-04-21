package ro.ase.cts.template;

public abstract class TemplateOcupareMasa {
	protected int cod;
	
	public TemplateOcupareMasa(int cod) {
		super();
		this.cod = cod;
	}
	public abstract void curataMasa();
	public abstract void aseazaServetele();
	public abstract void aseazaTacamuri();
	public abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
	};

}
