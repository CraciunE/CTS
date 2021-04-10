package ro.as.cts.decorator;

public class Main {

	public static void main(String[] args) {
		Card card1= new Card("Craciun", 15000);
		card1.plataOnline(250);
		card1.plataNromala(55);
		
		Decorator cardNou= new Decorator(card1);
		cardNou.plataContactless(90);
		cardNou.plataOnline(120);
		
		DecoratorContactlessTelefon decorator= new DecoratorContactlessTelefon(card1);
		decorator.plataContactless(10);
	}

}
