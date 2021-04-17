package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{

	private OperatorRezervari operator;
	private int nrMinim;
	
	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinim) {
		super();
		this.operator = operator;
		this.nrMinim=nrMinim;
	}

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		if(nrPersoane >= nrMinim) {
			operator.realizeazaRezervare(numeClient, nrPersoane);
		}
		else {
			System.out.println("Veniti direct fara rezervare");
		}
	}
	
	
	

}
