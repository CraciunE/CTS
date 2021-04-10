package ro.as.cts.decorator;

public class Card  implements CardAbstract{
	
	private String titular;
	private int sold;
	
	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}

	@Override
	public void plataOnline(int suma) {
		// TODO Auto-generated method stub
		
		if(sold>suma) {
			sold=suma;
			System.out.println("S-a realizat plata online "+ suma);
		}
		
	}

	@Override
	public void plataNromala(int suma) {
		// TODO Auto-generated method stub
		if(sold>suma) {
			sold=suma;
			System.out.println("S-a realizat plata normala "+ suma);
		}
		
	}
	

}
