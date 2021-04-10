package ro.as.cts.facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana persoana = new Persoana("Gigel", "1990412125723");
	
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou = new BirouDeCredite();
				if(!birou.areCredite(persoana));
				{
					System.out.println("S-a creat contul!");
				}
			}
		}
		
		Persoana persoana2= new Persoana("Mirela", "2990715178835");
		if(FacadeVerificatorPersoana.verificaPersoana(persoana2)) {
			System.out.println("S-a creat contul!");
		}
		else {
			System.out.println("Nu puteti fi clientul nostru");
		}

	}

}
