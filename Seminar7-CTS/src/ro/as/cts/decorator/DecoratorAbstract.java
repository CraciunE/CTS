package ro.as.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract{
	
	private Card card;
	
	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void plataOnline(int suma) {
		// TODO Auto-generated method stub
		card.plataOnline(suma);
		
	}

	@Override
	public void plataNromala(int suma) {
		// TODO Auto-generated method stub
		card.plataNromala(suma);
	}
	
	public abstract void plataContactless(int suma);

	public Card getCard() {
		return card;
	} 
	
	

}
