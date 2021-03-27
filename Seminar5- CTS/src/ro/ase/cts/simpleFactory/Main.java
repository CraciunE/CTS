package ro.ase.cts.simpleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory factory= new Factory();
		Jucator portar=  factory.getJucator(TipJucator.Portar, "Dorel");
		Jucator fundas= factory.getJucator(TipJucator.Fundas,"Ionel" );
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
