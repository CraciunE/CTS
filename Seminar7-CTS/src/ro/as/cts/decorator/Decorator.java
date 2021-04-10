package ro.as.cts.decorator;

public class Decorator extends DecoratorAbstract {

	public Decorator(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plataContactless(int suma) {
		// TODO Auto-generated method stub
		if (super.getCard().getSold() > suma) {
			System.out.println("S-a realizat plata contactless " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
	}

}
